# 💼 Desafio Prático: Criando um Sistema com SOLID em Java

## 📘 Cenário

Uma empresa deseja criar um **sistema de envio de pedidos**, que deve:
- Gerar confirmações
- Aplicar regras de desconto
- Salvar o pedido
- Notificar o cliente

O sistema precisa ser **escalável**, **flexível para futuras mudanças** e **fácil de manter**, pois diferentes clientes podem ter regras de negócio específicas.

---

## 🎯 Objetivo

Projetar e implementar esse sistema aplicando **todos os 5 princípios SOLID**, de forma clara e prática.

---

## 🧩 Componentes a Serem Criados

### 🔹 `Pedido`
- Classe que representa o pedido com dados como:
  - Valor total
  - Lista de produtos
  - Cliente

### 🔹 `RegraDesconto` (interface)
- Interface com método:  
  `double calcularDesconto(Pedido pedido);`
- Exemplos de implementações:
  - `DescontoNatal`
  - `DescontoClienteVIP`

### 🔹 `ServicoPedido`
- Classe orquestradora que:
  - Aplica regras de desconto
  - Persiste o pedido
  - Notifica o cliente

### 🔹 `RepositorioPedido` (interface)
- Interface com método:  
  `void salvar(Pedido pedido);`
- Exemplos de implementações:
  - `RepositorioMySQL`
  - `RepositorioMongo`

### 🔹 `Notificador` (interface)
- Interface com método:  
  `void enviar(Pedido pedido);`
- Exemplos de implementações:
  - `NotificadorEmail`
  - `NotificadorSMS`

---

## 💡 Fluxo do Sistema

```plaintext
Cliente → cria Pedido
        → passa para ServicoPedido
                → aplica RegraDesconto
                → salva com RepositorioPedido
                → envia notificação com Notificador
```

### Exercício:

- Criar os componentes sugeridos acima
- Implementar ao menos duas estratégias de desconto
- Criar duas formas de notificação
- Simular diferentes persistências de dados
- Criar um main() que orquestra todo o processo com injeção de dependências
- Justificar, para cada classe ou interface criada, qual princípio SOLID está sendo aplicado e por quê
