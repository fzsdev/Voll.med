# PROJETO ESTUDO SPRING BOOT (CRUD)

## Estudo de Spring Boot baseado no curso da plataforma Alura 

#### Ferramentas e start no projeto:

- Spring Boot (ver 3.0.6)
- JAVA SDK 17 Oracle
- MySQL (Ver 8.0.32)
- DBeaver
- Insomnia
* Ambiente desenvolvimento: Windows 10 com WSL2 (Ubuntu 20.04.6 LTS)

Para iniciar, baixar dependências do projeto pelo Maven (arquivo `pom.xml`), utilizar MySQL ver 8, e ferramentas
de acesso ao banco de dados pelo DBeaver e Insomnia. 
Criar e configurar o banco de dados como `vollmed_api`
Inicializar o `MySQL` antes de rodar o `ApiApplication.java`.
-------------

### Resumo:

- Utilização Spring Boot versão 3, estudo de CRUD em API Rest;
- Foi utilizado o `Spring Initializr` para iniciar com as dependências: "WEB, Validation, Spring Data JPA e Lombok";
- Driver Spring: MySQL e Flyway;
- O lombok foi utilizado na criação dos `Getters` e `Setters` com anotações Spring;
- As configurações foram feitas no arquivo `application.properties` localizado na pasta `resources`;
- Migrations foram usadas para modificar o banco de dados na evolução do projeto;
- Implementação dos métodos: `GET, POST, UPDATE, DELETE`;
- Uso de `repository` do Spring JPA para facilitar acesso aos dados do banco;
- Mapeamento das entidades JPA.
---
Em atualização.