package com.challenge.cryptography.service;

import com.challenge.cryptography.dto.TransactionDTO;
import com.challenge.cryptography.model.Transaction;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MappingService {

    @Autowired
    private ModelMapper modelMapper;

    public Transaction toModel(TransactionDTO transactionDTO) {
        return modelMapper.map(transactionDTO, Transaction.class);
    }

    public TransactionDTO toDto(Transaction transaction) {
        return modelMapper.map(transaction, TransactionDTO.class);
    }

    public void toModel(TransactionDTO transactionDTO, Transaction transaction) {
        modelMapper.map(transactionDTO, transaction);
    }

}
