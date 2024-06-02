package com.challenge.cryptography.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "tb_transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;

    @Column(name = "user_document", nullable = false)
    private String userDocument;

    @Column(name = "credit_card_token", nullable = false)
    private String creditCardToken;

    @Column(name = "transaction_value", nullable = false)
    private Long transactionValue;

}
