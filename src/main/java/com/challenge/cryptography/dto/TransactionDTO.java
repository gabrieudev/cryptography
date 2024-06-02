package com.challenge.cryptography.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransactionDTO {

    private Long id;

    @NotBlank(message = "User document is mandatory")
    private String userDocument;

    @NotBlank(message = "Credit card token is mandatory")
    private String creditCardToken;

    @NotNull(message = "Transaction value is mandatory")
    private Long transactionValue;

}
