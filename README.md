# 📋 ToDo List API - Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen)
![H2 Database](https://img.shields.io/badge/H2-Database-yellow)
![Docker](https://img.shields.io/badge/Docker-Ready-blue)

API de gerenciamento de tarefas desenvolvida durante estudos de Java com Spring Boot no curso da Rocketseat. A aplicação implementa autenticação customizada com BCrypt e filtros de segurança.

##  Funcionalidades

- ✅ Cadastro de usuários com senhas criptografadas (BCrypt)
- ✅ Autenticação via Basic Auth com filtros customizados
- ✅ CRUD completo de tarefas
- ✅ Validação de datas e propriedade das tarefas por usuário
- ✅ Atualização parcial de tarefas (PATCH)
- ✅ Banco de dados H2 em memória para desenvolvimento

## 🛠️ Tecnologias e Conceitos

| Tecnologia | Descrição |
|------------|-----------|
| **Spring Boot 3** | Framework principal |
| **Spring Data JPA** | Abstração de banco de dados |
| **H2 Database** | Banco em memória para desenvolvimento |
| **Lombok** | Redução de código boilerplate |
| **BCrypt** | Hashing seguro de senhas |
| **Custom Filters** | Autenticação via `OncePerRequestFilter` |
| **Docker** | Containerização da aplicação |

## 🔐 Segurança e Autenticação

A API implementa um sistema de **Basic Auth manual**:

- Senhas armazenadas com hash BCrypt
- Filtro customizado intercepta requisições para `/tasks/*`
- Decodificação do header `Authorization`
- Validação das credenciais diretamente no banco
- Acesso apenas às tarefas do próprio usuário

## 🚀 Como executar localmente

### Pré-requisitos
- Java 17
- Maven 
- Docker 

### Passo a passo

```bash
# Clone o repositório
git clone https://github.com/Jotshh/todolist.git

# Entre na pasta do projeto
cd todolist/todolist

# Execute com Maven Wrapper
./mvnw spring-boot:run

http://localhost:8080

```

### 📚 Endpoints da API
#### Usuários

| Método  | Endpoint |Descrição|
|------------|-----------|-----------|
| POST  | /users/ |Criar novo usuário|

Exemplo de requisição:

```
json
{
  "name": "João Silva",
  "username": "joao",
  "password": "12345"
}
```
#### Tarefas (requer autenticação)
| Método  | Endpoint |Descrição|
|------------|-----------|-----------|
| POST  | /tasks/ |Criar nova tarefa|
| GET  | /tasks/ |Listar tarefas do usuário|
| PUT  | /tasks/{id} |Atualizar tarefa|
| PATCH  | /tasks/{id} |Atualização parcial|

Exemplo de tarefa:

```
json
{
  "description": "Estudar Spring Boot",
  "title": "Spring Security",
  "priority": "ALTA",
  "startAt":"2026-03-01T10:00:00",
  "endAt":"2026-03-01T12:00:00"
}
```

##  Acessando o H2 Console
<img width="577" height="401" alt="image" src="https://github.com/user-attachments/assets/353f5f7d-3943-4d64-9e42-9e67d459411f" />

```
URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:todolist
Username: admin
Password: admin
```


## 📝 Melhorias Futuras

- Implementar JWT
- Adicionar DELETE
- Migrar para PostgreSQL

## Contato
Josiel Phelipe
josiephelipel265@gmail.com
