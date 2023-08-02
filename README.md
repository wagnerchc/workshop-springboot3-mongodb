# Java com Springboot 3 e MongoDB

[![Static Badge](https://img.shields.io/badge/license-GNU-green)](https://github.com/wagnerchc/workshop-springboot3-mongodb/blob/main/LICENSE)

Projeto do curso de Java com Spring Boot 3 e JPA / Hibernate

# Sobre o projeto

Aplicação backend em Java utilizando Springboot 3 e MongoDB.

## Modelo conceitual

![Modelo Conceitual](https://github.com/wagnerchc/assets/blob/main/github-projects-img/git-workshop-springboot3-mongodb-modelo-conceitual.jpg)

# Tecnologias utilizadas

## Back end

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- MongoDB

# Como executar o projeto

## Back end

Pré-requisitos: Java 17 e MongoDB

```bash
# clonar repositório
git clone https://github.com/wagnerchc/workshop-springboot3-mongodb.git

# executar o projeto
./mvnw spring-boot:run
```

## Endpoints da aplicação em ambiente local com Postman API Platform

<ul>
    <li>GET - Consultar lista de usuários cadastrados - http://localhost:8080/users</li>
    <li>POS - Cadastrar novo usuário - http://localhost:8080/users</li>
    <li>GET - Consultar um usuário - http://localhost:8080/users/{id}</li>
    <li>PUT - Atualizar um usuário - http://localhost:8080/users/{id}</li>
    <li>DELETE - Excluir um usuário - http://localhost:8080/users/{id}</li>
</ul>

# Autor

Wagner Pereira Chequeleiro

https://www.linkedin.com/in/wagnerpch/

## Contribuição e agradecimento

Projeto desenvolvido a partir das aulas do professor Nelio Alves, obtidas na plataforma de ensino Udemy, mais informações do curso <a href="https://www.udemy.com/course/java-curso-completo/" target="_blank">clique aqui<a>. Agradeço ao professor por proporcional acesso didático e organizado ao mundo do JAVA.
