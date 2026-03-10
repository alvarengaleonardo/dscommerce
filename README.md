🛒 DSCommerce API

API REST desenvolvida em Java com Spring Boot para gerenciamento de um sistema de e-commerce.
A aplicação implementa autenticação segura, controle de acesso, gerenciamento de pedidos e integração com banco de dados relacional.

O projeto foi estruturado seguindo boas práticas de arquitetura em camadas, segurança com OAuth2 + JWT, além de configuração para múltiplos ambientes.
___
🚀 Tecnologias Utilizadas

- Java 21 LTS
- Spring Boot
- Spring Data JPA
- Spring Security
- OAuth2
- JWT (JSON Web Token)
- Hibernate / JPA
- Maven
- Banco de dados relacional
___
🏗️ Arquitetura da Aplicação

A aplicação segue o padrão de arquitetura em camadas, separando responsabilidades e facilitando manutenção e escalabilidade.

```
src/main/java/com/devsuperior/dscommerce
│
├── controllers     → Endpoints da API
├── services        → Regras de negócio
├── repositories    → Acesso ao banco de dados
├── entities        → Modelo de domínio
├── dto             → Transferência de dados
├── config          → Configurações da aplicação
└── exceptions      → Tratamento global de erros
```


Essa estrutura melhora manutenção, testabilidade e escalabilidade da aplicação.
___
🌐 API REST

A API disponibiliza endpoints RESTful para gerenciamento dos recursos da aplicação.

Exemplos de endpoints:
```
GET /products
GET /orders/{id}
POST /orders
POST /oauth2/token
```
Os endpoints seguem boas práticas de padronização REST e utilização correta de métodos HTTP.
___
⚠️ Tratamento de Exceções e Validação

A aplicação possui um tratamento global de exceções, garantindo respostas padronizadas da API.

Também utiliza Bean Validation para validação de dados nas requisições.

Principais anotações utilizadas:

- @NotNull
- @NotBlank
- @Size
___
🔎 Persistência de Dados

O acesso ao banco é realizado com Spring Data JPA, permitindo:

- consultas derivadas
- consultas customizadas com JPQL
- paginação e ordenação com Pageable
___
🔐 Segurança

A aplicação implementa autenticação e autorização utilizando Spring Security.

Recursos implementados:
- OAuth2
- JWT (JSON Web Token)
- Controle de acesso baseado em cargos(Ex: Usuario e admin)
___
🔄 CI/CD e Deploy

O projeto foi estruturado para suportar integração contínua e implantação automatizada (CI/CD), permitindo:
- build automatizado
- execução de testes
- empacotamento da aplicação
- deploy em ambientes de homologação e produção
___
🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:
- aplicação de boas práticas com Spring Boot
- construção de APIs REST seguras
- implementação de arquitetura em camadas
- utilização de OAuth2 e JWT para autenticação
- simulação de um sistema real de e-commerce
___
👨‍💻 Autor

Leonardo Alvarenga

LinkedIn
www.linkedin.com/in/alvarengaleonardo
