<h1>Projeto em Arquitetura limpa</h1> 

<p align="center">
  <img src="https://img.shields.io/static/v1?label=spring&message=framework&color=green&style=for-the-badge&logo=SPRING"/>
  <img src="http://img.shields.io/static/v1?label=Spring&message=3.0.0&color=red&style=for-the-badge&logo=spring"/>
  <img src="https://img.shields.io/static/v1?label=&message=WebFlux&color=gray&style=for-the-badge&logo=WebFlux"/>
  <img src="https://img.shields.io/static/v1?label=&message=Docker&color=gray&style=for-the-badge&logo=Docker"/>
  <img src="https://img.shields.io/static/v1?label=&message=JAVA-17&color=brightgreen&style=for-the-badge&logo=WebFlux"/>
  <img src="https://img.shields.io/static/v1?label=&message=MongoDb&color=green&style=for-the-badge&logo=WebFlux"/>
  <img src="http://img.shields.io/static/v1?label=TESTES&message=%3E1&color=GREEN&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge"/>
</p>


### Tópicos

[Descrição do projeto](#descrição-do-projeto)

[Funcionalidades](#funcionalidades)

[Pré-requisitos](#pré-requisitos)

[Como rodar a aplicação](#como-rodar-a-aplicação)

[Observações](#observações)


## Descrição do projeto

<p align="justify">
  A aplicação aqui em desenvolvimento tem o objetivo fixar conhecimento em arquitetura limpa. 
</p>

## Funcionalidades

* A sua função é de salvar um novo produto e bens ainda em desenvolvimento apenas testes para fixar o conhecimento.


## Pré-requisitos

* [Docker](https://docs.docker.com/get-docker/)
* [JAVA](https://www.java.com/pt-BR/)
* [MAVEN](https://maven.apache.org/)


## Como rodar a aplicação:

* No terminal, clone o projeto:
```
git clone  https://github.com/Antonio06Martins/clean-architecture.git
```

* Com o Docker iniciado:
```
docker-compose up -d
```

## Observações
* Algumas evoluções devem ser feitas no decorrer do estudo.
* Como adicionas Swagger.
* Adicionar Client para consumir outra API com web-flux.
* Adicionar consumer e producer para com Kafka-stream.
* Adicionar Prometheus para metricas e Jaeger para rastreamento da aplicação.
 