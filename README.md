# 💰 MoneyTracker - API de Controle de Finanças Pessoais  

MoneyTracker é uma API desenvolvida em **Java + Spring Boot** para gerenciar finanças pessoais.  
Ela permite **cadastrar orçamentos, categorias e transações**, além de calcular o saldo disponível automaticamente.

---

## 🚀 Funcionalidades
✅ Cadastro de usuários  
✅ Criar e gerenciar **orçamentos**  
✅ Criar **categorias** para organizar transações  
✅ Registrar **receitas e despesas**  
✅ Listar transações por período  
✅ Cálculo automático do **saldo disponível**  

---

## 🛠 Tecnologias Utilizadas
- **Java 17 + Spring Boot 3**
- **Spring Data JPA** + **PostgreSQL**
- **Maven** para gerenciamento de dependências
- **Swagger** para documentação da API
- **Postman** para testes

---

## 📡 Endpoints da API
### 📌 **Orçamentos (`/budgets`)**
| Método | Endpoint | Descrição |
|--------|---------|------------|
| `POST` | `/budgets` | Criar um orçamento |
| `GET` | `/budgets` | Listar todos os orçamentos |
| `GET` | `/budgets/{id}` | Buscar orçamento por ID |
| `PUT` | `/budgets/{id}` | Atualizar orçamento |
| `DELETE` | `/budgets/{id}` | Deletar orçamento |

### 📌 **Transações (`/transactions`)**
| Método | Endpoint | Descrição |
|--------|---------|------------|
| `POST` | `/transactions` | Criar uma transação |
| `GET` | `/transactions` | Listar todas as transações |
| `GET` | `/transactions/{id}` | Buscar transação por ID |
| `GET` | `/transactions?startDate=YYYY-MM-DD&endDate=YYYY-MM-DD` | Filtrar transações por período |
| `PUT` | `/transactions/{id}` | Atualizar transação |
| `DELETE` | `/transactions/{id}` | Deletar transação |

---

## ⚡ Como Rodar o Projeto Localmente
### **Pré-requisitos**
✔️ **Java 17+** instalado  
✔️ **PostgreSQL** rodando e configurado  
✔️ **Maven** instalado  

### **Passos**
1️⃣ **Clone o repositório**:
```sh
git clone https://github.com/MacedoFilho/moneytracker.git
cd moneytracker

2️⃣ Configure o banco de dados no arquivo application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/moneytracker
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

3️⃣ Compile e execute o projeto:

sh
Copiar
Editar
mvn clean install
mvn spring-boot:run

4️⃣ Acesse a API via Swagger:

bash
Copiar
Editar
http://localhost:8080/swagger-ui.html

📌 Contato
Caso tenha dúvidas ou sugestões, entre em contato:
📧 Email: ricardomacedodev@gmail.com
🔗 GitHub: MaccedoFilho
