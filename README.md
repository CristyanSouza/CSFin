<h1 align="center"> 💻 Projeto CSFin </h1>

<p>Projeto criado para colocar em prática o aprendizado em Java e Spring Framework e em ReactJS.<br>
No projeto foi criada uma API de vendas realizadas, os dados estão armazenados em um banco de dados em memória h2, que é povoado automaticamente ao rodar o projeto.
É possível visualizar os dados das vendas realizadas e filtrar entre duas datas, assim como enviar um SMS sobre a venda para o telefone cadastrado (via Twilio)
</p>

<h1 align="center"> 🛠 Tecnologias utilizadas: </h1>

<h2> Backend: </h2>

- Java
- Spring MVC
- Spring Data JPA

<h2> Frontend: </h2>

- ReactJS
- TypeScript
- HTML
- CSS

## 🎨 Layout



![image](https://user-images.githubusercontent.com/104795862/208689892-a3c45cb6-f675-4695-853d-6fede654e8c9.png)
![image](https://user-images.githubusercontent.com/104795862/208689989-5ca5fef1-efc1-44b4-bef4-a4247b7ee4af.png)


## 🚀 Como executar o projeto

Este projeto é divido em duas partes:
1. Backend 
2. Frontend


💡Tanto o Frontend quanto o Backend precisam estar sendo executados para o projeto funcionar.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Node.js](https://nodejs.org/en/), [Jdk](https://www.oracle.com/eg/java/technologies/downloads/)
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)

Obs: Para que o SMS seja enviado, será necessário criar uma conta na plataforma Twilio e alterar as seguintes variáveis em "application.properties".

- Twilio SID, Twilio Key e Twilio_Phone_From são dados de sua conta na Twilio
- Twilio_Phone_To é o telefone de destino do SMS

![image](https://user-images.githubusercontent.com/104795862/208692585-7f1de4d5-fedb-442b-a727-33eed7fe67c2.png)


#### 🎲 Rodando o Backend (servidor)

```bash

# Clone este repositório
$ git clone https://github.com/CristyanSouza/CSFin.git

# Acesse a pasta backend e no package default e rode o arquivo "CsFinApplication.java"

# O servidor inciará na porta:8080 - acesse os endpoints a partir da url http://localhost:8080 

```

#### 🧭 Rodando a aplicação web (Frontend)

```bash

# Com o repositório ja clonado, acesse a pasta "frontend"
$ cd frontend

# Instale as dependências
$ npm install

# Execute a aplicação
$ npm start

# A aplicação será aberta na porta:3000
$ acesse http://localhost:3000 (a aplicação será aberta automaticamente ao executar o código npm start)






