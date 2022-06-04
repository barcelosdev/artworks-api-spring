# Artworks API

Esta é uma API RESTful com objetivo de consumir os dados da API externa  **[Art Institute of Chicago API](https://api.artic.edu/docs/#introduction)**, 
retornando alguns dados em JSON.

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
3. Abra sua IDE e antes de tudo, abra o arquivo application.properties que está dentro da pasta resources e altere as informações do nome do banco (caso tenha utilizado um nome de banco diferente), o nome de usuário e a senha do banco. Por padrão do MySQL, usuário "root" e senha "root", caso não tenha cadastrado outra senha no momento da configuração do banco.
 <div align="center">
     <img src="src/main/resources/img/application_properties.png" alt="drawing" width="500"/>
 </div>
4. Rode o projeto na classe principal **ArtworksAPIApplication.java**:
<div align="center">
    <img src="src/main/resources/img/run_project.png" alt="drawing" width="500"/>
</div>
5. Caso tudo o ocorra bem, o Spring retornará o log com este final:
<div align="center">
   <img src="src/main/resources/img/log.png" alt="drawing" width="780"/>
</div>
6. Abra seu navegador ou o Postman (caso o tenho instalado, utilize o método GET) e digite ou cole o endereço: `localhost:8080/arts-app/artworks/filter/monet` para testarmos a API. Este método retornará as obras de artes com o filtro da palavra chave "monet".
7. Deverá mostrar o retorno da pesquisa no formato JSON, desta forma:
<div align="center">
   <img src="src/main/resources/img/json_return.png" alt="drawing" width="500"/>
</div>

