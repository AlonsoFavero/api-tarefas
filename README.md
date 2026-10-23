# API de Tarefas — REST API com Java e Spring Boot

API REST desenvolvida para gerenciamento de tarefas, com operações CRUD, validação de dados e testes automatizados. O projeto faz parte da minha jornada de estudos em Análise e Desenvolvimento de Sistemas, com foco na construção de aplicações Backend utilizando Java e Spring Boot.

O objetivo é aplicar conceitos fundamentais de desenvolvimento de APIs, organização de código, tratamento de requisições HTTP e testes automatizados, seguindo boas práticas de desenvolvimento.

## Sobre o projeto

A API permite criar, consultar, atualizar e excluir tarefas. Cada tarefa possui um título e uma descrição, com validações para impedir o envio de dados inválidos.

O projeto também possui testes automatizados para verificar o comportamento dos endpoints, incluindo cenários de sucesso, validação de dados e recursos não encontrados.

## Funcionalidades

- Criar uma tarefa.
- Listar todas as tarefas.
- Buscar uma tarefa pelo ID.
- Atualizar uma tarefa existente.
- Excluir uma tarefa.
- Validar campos obrigatórios.
- Rejeitar títulos e descrições vazios ou compostos apenas por espaços.
- Retornar respostas HTTP adequadas para recursos inexistentes.
- Executar testes automatizados dos endpoints.

## Tecnologias utilizadas

- **Java** — linguagem de programação.
- **Spring Boot** — estrutura da aplicação Backend.
- **Spring Web** — criação dos endpoints REST.
- **Bean Validation** — validação dos dados recebidos.
- **JUnit 5** — testes automatizados.
- **MockMvc** — testes dos endpoints HTTP.
- **Maven** — gerenciamento de dependências e execução dos testes.
- **Git e GitHub** — versionamento e publicação do projeto.

## Endpoints da API

| Método | Endpoint | Descrição |
|---|---|---|
| `POST` | `/tarefas` | Cria uma tarefa |
| `GET` | `/tarefas` | Lista as tarefas |
| `GET` | `/tarefas/{id}` | Busca uma tarefa pelo ID |
| `PUT` | `/tarefas/{id}` | Atualiza uma tarefa |
| `DELETE` | `/tarefas/{id}` | Exclui uma tarefa |

### Exemplo de requisição

Para criar uma tarefa, envie uma requisição `POST` para `/tarefas` com o seguinte JSON:

```json
{
  "titulo": "Estudar Java",
  "descricao": "Praticar desenvolvimento Backend"
}
```

### Validações implementadas

A API rejeita requisições com título ou descrição vazios ou contendo apenas espaços em branco. Também possui testes para verificar o comportamento ao consultar, atualizar ou excluir uma tarefa inexistente.

## Como executar o projeto

### Pré-requisitos

- Java compatível com a versão configurada no projeto.
- Git.
- Terminal ou IDE de sua preferência, como IntelliJ IDEA.

### 1. Clone o repositório

```bash
git clone https://github.com/AlonsoFavero/api-tarefas.git
```

Substitua `https://github.com/AlonsoFavero/api-tarefas.git` pelo endereço do repositório no GitHub.

### 2. Acesse a pasta do projeto

```bash
cd api-tarefas
```

### 3. Execute os testes automatizados

No Linux ou macOS:

```bash
./mvnw test
```

No Windows:

```bash
mvnw.cmd test
```

Ao final, procure por `BUILD SUCCESS` para confirmar que os testes passaram.

### 4. Execute a aplicação

Se o projeto estiver configurado com o plugin Spring Boot Maven, execute:

```bash
./mvnw spring-boot:run
```

Depois que a aplicação iniciar, você poderá testar os endpoints utilizando uma ferramenta como Postman ou Insomnia.

> A porta e as configurações de execução dependem da configuração atual da aplicação.

## Testes automatizados

O projeto contém testes de integração com Spring Boot e MockMvc, cobrindo os principais fluxos da API:

- Listagem e consulta de tarefas.
- Criação de tarefas.
- Atualização de tarefas.
- Exclusão de tarefas.
- Validação de campos obrigatórios.
- Rejeição de valores compostos apenas por espaços.
- Respostas para tarefas inexistentes.

Os testes ajudam a verificar se os endpoints continuam funcionando conforme esperado após alterações no código.

## Organização do projeto

O código está organizado em componentes com responsabilidades distintas, incluindo:

- **Controller:** recebe as requisições HTTP e disponibiliza os endpoints.
- **Service:** concentra as operações e regras de negócio.
- **Model:** representa os dados da tarefa.
- **Testes:** verificam o comportamento da API.

Essa separação facilita a manutenção, a leitura e a evolução da aplicação.

## Aprendizados

Durante o desenvolvimento, pratiquei conceitos importantes para o desenvolvimento Backend com Java:

- Construção de APIs REST.
- Uso de métodos HTTP e códigos de status.
- Injeção de dependências com Spring.
- Validação de dados recebidos nas requisições.
- Separação de responsabilidades entre componentes.
- Testes automatizados com JUnit 5 e MockMvc.
- Versionamento de código com Git.

## Próximas evoluções

Como oportunidades de evolução, o projeto pode receber:

- Persistência de dados com Spring Data JPA e banco de dados relacional.
- Documentação interativa com Swagger/OpenAPI.
- Tratamento padronizado de erros.
- Autenticação e autorização.
- Testes adicionais e pipeline de integração contínua.

## Sobre mim

Sou estudante de Análise e Desenvolvimento de Sistemas, com foco em desenvolvimento Backend utilizando Java e Spring Boot.

Estou construindo projetos práticos para consolidar meus conhecimentos em programação, APIs REST, testes automatizados e boas práticas de desenvolvimento, com o objetivo de ingressar profissionalmente na área de tecnologia.

**Objetivo profissional:** Estágio Backend Java ou Desenvolvedor Java Júnior.

