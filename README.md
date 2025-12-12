# 🏗️ SOLID Principles - Java

Repositório de atividades práticas sobre os Princípios SOLID aplicados em Java, desenvolvido para a disciplina de Arquitetura de Sistemas.

## 📚 Sobre o Projeto

Este repositório contém implementações práticas dos princípios SOLID através de cenários reais de refatoração de código. Cada atividade apresenta um código problemático que viola um ou mais princípios SOLID e sua respectiva solução refatorada.

## 🎯 Princípios SOLID Implementados

### **S** - Single Responsibility Principle (SRP)
> "Uma classe deve ter apenas uma razão para mudar"

### **O** - Open/Closed Principle (OCP)
> "Entidades devem estar abertas para extensão, mas fechadas para modificação"

### **L** - Liskov Substitution Principle (LSP)
> "Objetos de uma superclasse devem poder ser substituídos por objetos de suas subclasses sem quebrar a aplicação"

### **I** - Interface Segregation Principle (ISP)
> "Nenhum cliente deve ser forçado a depender de métodos que não utiliza"

### **D** - Dependency Inversion Principle (DIP)
> "Dependa de abstrações, não de implementações concretas"

## 📂 Estrutura do Repositório

```
solid-principles/
│
├── src/main/java/org/solid/
│   │
│   ├── srp/
│   │   ├── atividade01/          # SRP - Sistema de Funcionários
│   │   │   ├── violacao/         # Código com violação do SRP
│   │   │   └── solucao/          # Código refatorado
│   │   │
│   │   └── atividade02/          # SRP - Sistema de Pedidos
│   │       ├── violacao/         # Código com violação do SRP
│   │       └── solucao/          # Código refatorado
│   │
│   ├── ocp/                      # OCP - Sistema de Descontos
│   │   ├── violacao/             # Código com violação do OCP
│   │   └── solucao/              # Código refatorado
│   │
│   └── lsp/                      # LSP - Sistema de Frete 
│       ├── violacao/             # Código com violação do LSP
│       └── solucao/              # Código refatorado (em desenvolvimento)
│
├── pom.xml
└── README.md
```

## 🎓 Atividades

### Atividade 1: SRP - Sistema de Funcionários
**Cenário:** Classe `Funcionario` que mistura responsabilidades de cálculo de salário, persistência e geração de relatórios.

**Violação:** Uma única classe com três responsabilidades distintas.

**Solução:** Separação em classes especializadas:
- `CalculadoraDeSalario` - Responsável por cálculos
- `RepositorioDeFuncionario` - Responsável por persistência
- `GeradorDeRelatorio` - Responsável por relatórios

---

### Atividade 2: SRP - Sistema de Pedidos
**Cenário:** Classe `ProcessadorDePedido` da empresa TechStore que gerencia todo o ciclo de vida de um pedido.

**Violação:** Uma única classe com quatro responsabilidades:
1. Validação de estoque
2. Cálculo de frete e impostos
3. Persistência no banco de dados
4. Notificação por email

**Solução:** Separação em classes especializadas + classe de orquestração:
- `ValidadorDeEstoque` - Valida disponibilidade
- `CalculadoraDeCusto` - Calcula valores
- `RepositorioDePedido` - Persiste dados
- `NotificadorDePedido` - Envia notificações
- `ServicoDePedido` - Orquestra o fluxo

---

### Atividade 3: OCP - Sistema de Descontos
**Cenário:** Sistema de gerenciamento de descontos da TechStore com tipos variados (Cupom, VIP, Sazonal, Aniversário).

**Violação:** Uso de `if/else` para cada tipo de desconto, exigindo modificação da classe central a cada novo desconto.

**Solução:** Aplicação do padrão Strategy:
- Interface `EstrategiaDeDesconto`
- Classes concretas: `DescontoCupom`, `DescontoVIP`, `DescontoSazonal`, `DescontoAniversario`
- `CalculadoraDeDesconto` refatorada para receber estratégias

---

### Atividade 4: LSP - Sistema de Frete
**Cenário:** Sistema de cálculo de frete com pedidos padrão e pedidos com frete grátis.

**Violação:** Subclasse `PedidoComFreteGratis` quebra o contrato da superclasse `Pedido`, violando expectativas do código cliente.

**Solução:** _(em desenvolvimento)_

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Git

### Clonar e executar o projeto

```bash
# Clone o repositório
git clone https://github.com/leticiaguthss/solid-principles.git

# Entre na pasta do projeto
cd solid-principles

# Compile o projeto (se usar Maven)
mvn clean compile

# Execute uma classe específica (exemplo)
java -cp target/classes org.solid.srp.atividade01.violacao.Funcionario
```

### Compilar o projeto
```bash
mvn clean compile
```

### Executar uma atividade específica
```bash
# Exemplo: Executar a violação do SRP - Atividade 01
mvn exec:java -Dexec.mainClass="org.solid.srp.atividade01.violacao.Main"

# Exemplo: Executar a solução do SRP - Atividade 01
mvn exec:java -Dexec.mainClass="org.solid.srp.atividade01.solucao.Main"
```

## 🎨 Padrões de Projeto Utilizados

- **Strategy Pattern** - Usado nas refatorações de OCP e LSP
- **Dependency Injection** - Aplicado nas soluções de SRP
- **Separation of Concerns** - Princípio fundamental em todas as refatorações

## 📖 Aprendizados

### Por que SOLID é importante?

1. **Manutenibilidade** - Código mais fácil de manter e evoluir
2. **Testabilidade** - Classes com responsabilidades únicas são mais fáceis de testar
3. **Flexibilidade** - Sistema aberto para extensão sem modificação
4. **Reusabilidade** - Componentes podem ser reutilizados em diferentes contextos
5. **Baixo Acoplamento** - Reduz dependências entre classes

### Sinais de Violação dos Princípios

- **SRP:** Classes muito grandes com múltiplos métodos não relacionados
- **OCP:** Necessidade de modificar código existente para adicionar funcionalidades
- **LSP:** Subclasses que quebram comportamentos esperados da superclasse
- **ISP:** Interfaces "gordas" que forçam implementação de métodos não utilizados
- **DIP:** Dependência direta de classes concretas ao invés de abstrações

## 👨‍🏫 Disciplina

**Unidade Curricular:** Arquitetura de Sistemas  
**Professor:** Lucas Santos  
**Instituição:** WEG - CentroWEG  
**Curso:** Desenvolvimento de Sistemas  
**Aluna:** Letícia Emanuele Güths

---
