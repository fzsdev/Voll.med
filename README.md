# PROJETO ESTUDO SPRING BOOT (CRUD)

## Estudo de Spring Boot baseado no curso da plataforma Alura.

#### Ferramentas e start no projeto:

- Spring Boot (ver 3.0.7) - Dependencies : pom.xml (api)
- JAVA SDK 17 Oracle
- MySQL (Ver 8.0.32)
- DBeaver
- Insomnia

* Ambiente desenvolvimento: Windows 10 com WSL2 (Ubuntu 20.04.6 LTS)

------------

#### Start:

Para iniciar, baixar dependências do projeto pelo Maven (arquivo `pom.xml`), utilizar MySQL ver 8, e ferramentas
de acesso ao banco de dados pelo DBeaver e Insomnia.
Criar e configurar o banco de dados como `vollmed_api`
Inicializar o `MySQL` antes de rodar o `ApiApplication.java`.

-------------

#### Resumo:

#### _Parte 1 & 2:_

- Utilização Spring Boot versão 3, estudo de CRUD em API Rest;
- Foi utilizado o <a href="https://start.spring.io/" target="_blank">`Spring Initializr`</a> para iniciar com as
  dependências: "WEB, Validation, Spring Data JPA e Lombok";
- Driver Spring: MySQL e Flyway;
- Organização dos pacotes em `controller`, `domain` e `infra`;
- O lombok foi utilizado na criação dos `Getters` e `Setters` com anotações Spring;
- As configurações foram feitas no arquivo `application.properties` localizado na pasta `resources`;
- Migrations foram usadas para modificar o banco de dados na evolução do projeto;
- Implementação dos métodos: `GET, POST, UPDATE, DELETE`;
- Uso de `repository` do Spring JPA para facilitar acesso aos dados do banco;
- Mapeamento das entidades JPA;
- Controle de acesso com implementação da biblioteca `Auth0 java-jwt` utilizando tokens JWT com hash `BCrypt`.

---
Documentação pelo SpringDocs (Swagger UI): <br>

Para gerar a documentação automatica do projeto, foi utilizado uma lib do `Spring`
chamado <a href="https://springdoc.org/" target="_blank">`SpringDoc (link)`</a>, funciona
examinando a aplicação em tempo de execução para inferir a semântica da API com base nas configurações do Spring,
estrutura de classes e várias anotações.

- <a href="http://localhost:8080/swagger-ui/index.html" target="_blank">`Doc VollMed API - HTML`</a> <br>
- <a href="http://localhost:8080/v3/api-docs" target="_blank">`Doc VollMed API - JSON`</a>

*Acesso à documentação precisa ser feito localmente, com o projeto rodando.

---
Em atualização.
