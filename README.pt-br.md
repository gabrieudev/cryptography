# Desafio: Criptografia

![Java](https://img.shields.io/badge/Java-21-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/joão-santos-1115a5304/)
![GPL License](https://img.shields.io/badge/License-GPL-blue) [![LinkedIn](https://img.shields.io/badge/Type-Challenge-purple)](https://github.com/backend-br/desafios/blob/master/points-of-interest/PROBLEM.md)

Essa é a minha solução para o desafio backend de **Criptografia**. Acesse o [desafio](https://github.com/backend-br/desafios/blob/master/cryptography/PROBLEM.md) para obter mais informações do problema.  

## Tabela de conteúdos

- [Introdução](#introdução)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Iniciando](#iniciando)
- [Configuração](#configuração)
- [Endpoints](#endpoints)
- [Contribuições](#contribuições)
- [Contato](#contato)

## Introdução

O problema a ser resolvido consiste em garantir que os campos sensíveis da entidade não sejam visíveis diretamente, realizando a criptografia em tempo de execução durante a conversão da entidade para a coluna correspondente no banco de dados, e vice-versa.

## Funcionalidades

- Operações CRUD para a transação.
- Criptografia dos campos sensíveis.
- Descriptografia para a visualização.

## Tecnologias

- ![Java](https://img.shields.io/badge/Java-21-orange): Linguagem de programação.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework usado para a construção de aplicações voltadas à produção.
- ![H2](https://img.shields.io/badge/H2-Database-blue): Banco de dados em memória.

## Iniciando

Siga esses passos para executar o projeto na sua máquina:

1. Clone o repositório: `git clone https://github.com/gabrieudev/cryptography.git`
2. Navegue para o diretório do projeto: `cd <caminho>`
3. Atualize as configurações de banco de dados no arquivo `application.properties`
4. Construa a aplicação: `./mvnw clean install` (para Windows: `mvnw.cmd clean install`)
5. Execute a aplicação: `./mvnw spring-boot:run` (para Windows: `mvnw.cmd spring-boot:run`)

## Configuração

- Configuração de banco de dados: atualize o arquivo `application.properties` com as informações do seu banco de dados H2.

## Endpoints

- `POST /transactions`: Salva uma nova transação com os campos criptografados.
- `PUT /transactions`: Atualiza uma transação.
- `GET /transactions/{id}`: Obtém uma transação com os campos descriptografados.
- `GET /transactions`: Obtém todas transações com os campos descriptografados.
- `DELETE /transactions/{id}`: Deleta uma transação.

Acesse a documentação completa no endpoint `/swagger-ui.html`

## Contribuições

Contribuições são muito bem vindas! Caso queira contribuir, faça um fork do repositório e crie um pull request.

## Contato

Caso tenha alguma sugestão ou dúvida, entre em contato comigo em [LinkedIn](https://www.linkedin.com/in/gabrieudev/)

---

**Licença:** Esse projeto é licenciado sob os termos da [GNU General Public License (GPL)](LICENSE).
