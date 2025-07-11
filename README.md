# Sobre o Projeto

Este é um projeto de estudo que disponibiliza uma **API REST** desenvolvida em **Java com Spring Boot**, com o objetivo de listar camisas de clubes e seleções de futebol que marcaram época ou temporadas memoráveis.
A API fornece os dados em formato **JSON**, permitindo que futuramente sejam consumidos por um Front-End dedicado. Durante o desenvolvimento, os endpoints estão sendo testados com o Postman.
Uma funcionalidade importante da API é a organização personalizada das listas de camisas, permitindo reordenar os itens e salvar essa ordem diretamente no banco de dados.

# Testes Realizados via Postman

**GET**
<img width="2413" height="950" alt="Postman 1" src="https://github.com/user-attachments/assets/de193e08-12ce-4bc8-8130-a5df66bc6fc4" />


**POST**
<img width="2419" height="902" alt="Postman2" src="https://github.com/user-attachments/assets/289de9e0-81a0-40da-9259-16b10fb29dbd" />

# Modelo Conceitual 

<img width="902" height="653" alt="Modelo Conceitual Banco de Dados" src="https://github.com/user-attachments/assets/8f478593-907e-48df-8908-a0d767c6446d" />

# Tecnologias Utilizadas

## Back end
- Java

- JPA / Hibernate

- Maven

- Spring Boot

## Banco de Dados
- SQL

- H2 (para testes locais)

- PostgreSQL (produção)

## Arquitetura
- Padrão em camadas (Controllers REST, Services, Repositories)
