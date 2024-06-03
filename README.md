# Challenge: Cryptography

![Java](https://img.shields.io/badge/Java-21-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/joão-santos-1115a5304/)
![GPL License](https://img.shields.io/badge/License-GPL-blue) [![LinkedIn](https://img.shields.io/badge/Type-Challenge-purple)](https://github.com/backend-br/desafios/blob/master/points-of-interest/PROBLEM.md)

This is my solution for the backend **Cryptography** challenge. 

Please select your preferred language:

- [English](README.md)
- [Português (Brasil)](README.pt-br.md)

Check out the [challenge](https://github.com/backend-br/desafios/blob/master/cryptography/PROBLEM.md) for more information on the problem.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Endpoints](#endpoints)
- [Contributions](#contributions)
- [Contact](#contact)

## Introduction

The problem to be solved consists of ensuring that the sensitive fields of the entity are not directly visible, performing encryption at runtime during the conversion of the entity to the corresponding column in the database, and vice versa.

## Features

- CRUD operations for transactions.
- Encryption of sensitive fields.
- Decryption for viewing.

## Technologies

- ![Java](https://img.shields.io/badge/Java-21-orange): Programming language.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework for building production-ready applications.
- ![H2](https://img.shields.io/badge/H2-Database-blue): In-memory database.

## Getting Started

Follow these steps to run the project on your machine:

1. Clone the repository: `git clone https://github.com/gabrieudev/cryptography.git`
2. Navigate to the project directory: `cd <path>`
3. Update the database settings in the `application.properties` file.
4. Build the application: `./mvnw clean install` (for Windows: `mvnw.cmd clean install`)
5. Run the application: `./mvnw spring-boot:run` (for Windows: `mvnw.cmd spring-boot:run`)

## Configuration

- Database configuration: update the `application.properties` file with your H2 database information.

## Endpoints

- `POST /transactions`: Save a new transaction with encrypted fields.
- `PUT /transactions`: Update a transaction.
- `GET /transactions/{id}`: Retrieve a transaction with decrypted fields.
- `GET /transactions`: Retrieve all transactions with decrypted fields.
- `DELETE /transactions/{id}`: Delete a transaction.

Access the complete documentation at the `/swagger-ui.html` endpoint.

## Contributions

Contributions are very welcome! If you want to contribute, fork the repository and create a pull request.

## Contact

If you have any suggestions or questions, please contact me on [LinkedIn](https://www.linkedin.com/in/joão-santos-1115a5304/).

---

**License:** This project is licensed under the terms of the [GNU General Public License (GPL)](LICENSE).