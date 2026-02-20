🍔 Sistema-De-Delivery
Sistema de gerenciamento de pedidos para delivery, desenvolvido com Java puro (JDBC), postegreSQL
Este projeto tem como objetivo demonstrar aplicação prática de conceitos como:

Programação Orientada a Objetos

Arquitetura em camadas

Padrão DAO

Integração com banco de dados relacional

Desenvolvimento Web Java

🚀 Tecnologias Utilizadas

Java 17

Maven

PostgreSQL

JDBC

JSF (Jakarta Faces)

HTML5 / CSS3

Git & GitHub

🏗️ Arquitetura

O projeto segue separação em camadas:

src/main/java
│
├──model → Entidades do sistema
├──dao → Camada de persistência (CRUD)
├──service → Regras de negócio (em evolução)
└──db → Conexão com banco de dados

🗄️ Modelo de Dados
📌 Entidades principais

Order

Product

OrderProduct (tabela de relacionamento N:N)

Estrutura simplificada

tb_order

tb_product

tb_order_product

O banco utilizado é o PostgreSQL.

✅ Funcionalidades Implementadas
🔹 Backend (JDBC)

Conexão com PostgreSQL

CRUD completo de pedidos

Uso de PreparedStatement

Tratamento de SQLException

Retorno de ID gerado automaticamente

🔹 Em desenvolvimento

CRUD de produtos

Relacionamento pedido-produto

Camada de Service

Interface Web com JSF

⚙️ Como Executar o Projeto

Criar banco no PostgreSQL

Executar os scripts SQL das tabelas

Configurar usuário e senha na classe Conexao

Executar a classe Main

📈 Roadmap de Evolução
✔ Fase 1 – JDBC

 Conexão

 DAO Order

 DAO Product

🔄 Fase 2 – Arquitetura

 Service Layer

 Melhor tratamento de exceções

 Refatoração e organização

🌐 Fase 3 – Web

 Configuração JSF

 Managed Beans

 Páginas XHTML

 CRUD via interface

🚀 Fase 4 – Deploy

 Deploy em servidor (Tomcat)

 Publicação online

🎯 Objetivo Profissional

Este projeto foi desenvolvido com foco em consolidar conhecimentos necessários para atuação como Desenvolvedor Java, incluindo:

Estruturação de projetos Maven

Persistência com JDBC

Boas práticas de organização de código

Evolução para aplicação web

👨‍💻 Autor

Seu Nome
GitHub: (seu link)
LinkedIn: (seu link)