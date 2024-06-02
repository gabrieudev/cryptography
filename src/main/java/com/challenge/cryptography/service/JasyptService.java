package com.challenge.cryptography.service;

import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JasyptService {

    @Autowired
    private StrongTextEncryptor strongTextEncryptor;

    /**
     * encrypts a text
     *
     * @param text the raw text
     * @return the encrypted text
     */
    public String encrypt(String text) {
        return strongTextEncryptor.encrypt(text);
    }

    /**
     * decrypts a text
     *
     * @param text the encrypted text
     * @return the decrypted text
     */
    public String decrypt(String text) {
        return strongTextEncryptor.decrypt(text);
    }

}
