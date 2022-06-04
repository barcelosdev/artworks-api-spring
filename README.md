# Artworks API

Esta é uma API RESTful com objetivo de consumir os dados da API externa  **[Art Institute of Chicago API](https://api.artic.edu/docs/#introduction)**, 
retornando os alguns dados em JSON.

### Tecnologias utilizadas no projeto

- Java
- Spring Boot
- Maven
- MySQL

### Pré-requisitos

- IDE: [Intellij IDEA](https://www.jetbrains.com/pt-br/idea/download/), [Eclipse](https://www.eclipse.org/downloads/) ou [Netbeans](https://netbeans.apache.org/download/). Os exemplos a seguir são utilizando o Intellij.
- [Java JDK 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) ou posterior.
- [MySQL 8](https://dev.mysql.com/downloads/).

###  Quick Start

1. Clone o projeto do repositório: `git clone https://github.com/barcelosguitar/arts-app`.
2. No MySQL, crie o banco de dados "artwork_api": `create database artwork_api`.
3. Abra o arquivo application.properties que está na pasta resources.
4. Abra sua IDE e rode o projeto na classe principal **ArtworksAPIApplication.java**:
    | <img src="src/main/resources/img/run_project.png" alt="drawing" width="380"/> |
    |:                                                                             :|
5. 