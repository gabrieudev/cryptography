package com.challenge.cryptography.service;

import com.challenge.cryptography.dto.TransactionDTO;
import com.challenge.cryptography.exception.ObjectNotFoundException;
import com.challenge.cryptography.model.Transaction;
import com.challenge.cryptography.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private MappingService mappingService;

    @Autowired
    private JasyptService jasyptService;

    @Autowired
    private TransactionRepository transactionRepository;

    /**
     * retrieves a transaction by its id
     *
     * @param id the transaction's id
     * @return the transaction's DTO
     * @throws ObjectNotFoundException if the transaction is not found
     */
    public TransactionDTO getById(Long id) {

        Transaction transaction = transactionRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Transaction not found with this id: " + id)
        );

        TransactionDTO transactionDTO = mappingService.toDto(transaction);

        transactionDTO.setCreditCardToken(jasyptService.decrypt(transactionDTO.getCreditCardToken()));
        transactionDTO.setUserDocument(jasyptService.decrypt(transactionDTO.getUserDocument()));

        return transactionDTO;

    }

    /**
     * saves a transaction
     *
     * @param transactionDTO the transaction's DTO
     */
    public void save(TransactionDTO transactionDTO) {

        Transaction transaction = mappingService.toModel(transactionDTO);

        transaction.setCreditCardToken(jasyptService.encrypt(transaction.getCreditCardToken()));
        transaction.setUserDocument(jasyptService.encrypt(transaction.getUserDocument()));

        transactionRepository.save(transaction);

    }

    /**
     * updates a transaction
     *
     * @param transactionDTO the transaction's DTO
     * @return the updated transaction
     * @throws ObjectNotFoundException if the transation is not found
     */
    public TransactionDTO update(TransactionDTO transactionDTO) {

        Transaction transaction = transactionRepository.findById(transactionDTO.getId()).orElseThrow(
                () -> new ObjectNotFoundException("Transaction not found with this id: " + transactionDTO.getId())
        );

        mappingService.toModel(transactionDTO, transaction);

        transaction.setCreditCardToken(jasyptService.encrypt(transaction.getCreditCardToken()));
        transaction.setUserDocument(jasyptService.encrypt(transaction.getUserDocument()));

        TransactionDTO updatedTransaction = mappingService.toDto(transactionRepository.save(transaction));

        updatedTransaction.setUserDocument(jasyptService.decrypt(updatedTransaction.getUserDocument()));
        updatedTransaction.setCreditCardToken(jasyptService.decrypt(updatedTransaction.getCreditCardToken()));

        return updatedTransaction;

    }

    /**
     * deletes a transaction by its id
     *
     * @param id the transaction's id
     * @throws ObjectNotFoundException if the transaction is not found
     */
    public void delete(Long id) {

        Transaction transaction = transactionRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Transaction not found with this id: " + id)
        );

        transactionRepository.delete(transaction);

    }

    /**
     * retrieves all the transactions
     *
     * @return the List of transactions
     */
    public List<TransactionDTO> getAll() {

        List<TransactionDTO> transactionDTOList = transactionRepository.findAll().stream().map(
                transaction -> mappingService.toDto(transaction)
        ).toList();

        transactionDTOList.forEach(
                transactionDTO -> {
                    transactionDTO.setCreditCardToken(jasyptService.decrypt(transactionDTO.getCreditCardToken()));
                    transactionDTO.setUserDocument(jasyptService.decrypt(transactionDTO.getUserDocument()));
                }
        );

        return transactionDTOList;

    }

}
