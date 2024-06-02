package com.challenge.cryptography.config;

import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StrongTextEncryptorConfig {

    @Bean
    public StrongTextEncryptor strongTextEncryptor() {
        StrongTextEncryptor strongTextEncryptor = new StrongTextEncryptor();
        strongTextEncryptor.setPassword("password");
        return strongTextEncryptor;
    }

}
