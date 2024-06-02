package com.challenge.cryptography.controller;

import com.challenge.cryptography.dto.TransactionDTO;
import com.challenge.cryptography.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Object> save(@Valid @RequestBody TransactionDTO transactionDTO) {
        transactionService.save(transactionDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> getById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.getAll());
    }

    @PutMapping
    public ResponseEntity<TransactionDTO> update(@Valid @RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.update(transactionDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        transactionService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
