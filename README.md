# Treino Kotlin 🚀

Repositório dedicado ao estudo e prática da linguagem **Kotlin**. Este projeto compila diversos exercícios práticos desenvolvidos a partir de materiais de apoio, apostilas e aulas da faculdade, com foco especial na disciplina de **Programação Orientada a Objetos (POO)**.

## 📝 Descrição

O objetivo deste repositório é documentar a evolução no aprendizado de Kotlin, explorando desde conceitos básicos até tópicos mais avançados da linguagem e do paradigma orientado a objetos.

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Kotlin (JVM)
- **Gerenciador de Dependências:** Gradle (Kotlin DSL)
- **JDK:** 21+

## 📂 Estrutura do Projeto

O código está organizado da seguinte forma:

- `src/main/kotlin/aulalab/aulaabstrato/`: Práticas focadas em conceitos de abstração, incluindo:
    - Uso de **Classes Abstratas** e **Interfaces**.
    - Implementação de formas geométricas e polimorfismo.
- `src/main/kotlin/exercicios/`: Exercícios variados para fixação de lógica, sintaxe e conceitos de POO.

## 🚀 Lista de Exercícios

| Exercício | Descrição | Conceitos Explorados |
| :--- | :--- | :--- |
| **001** | Hello World | Sintaxe básica. |
| **002** | Saudação ao usuário | Entrada/Saída (`readln`). |
| **003** | Soma de números reais | Operadores aritméticos. |
| **004** | Análise de String | Propriedades de Strings (`length`, `isEmpty`, `isBlank`). |
| **005** | Antecessor e Sucessor | **Extension Functions**. |
| **006** | Dobro, Triplo e Raiz Quadrada | Funções matemáticas (`sqrt`). |
| **007** | Média de notas | Lógica básica e tipos numéricos. |
| **008** | Conversor de medidas | Conversão de unidades (m para km, cm, mm, etc.). |
| **009** | Tabuada | Laços de repetição (`for`). |
| **010** | Conversor de Moeda | Uso de classes e constantes. |
| **011** | Cálculo de Tinta | Cálculo de área e arredondamento (`ceil`). |
| **012** | Desconto de Produto | Lógica financeira básica. |
| **013** | Aumento Salarial | Uso de **Inner Classes**. |

## 🎓 Tópicos Estudados

- [x] Sintaxe básica de Kotlin.
- [x] Classes e Objetos.
- [x] Encapsulamento, Herança e Polimorfismo.
- [x] Classes Abstratas e Interfaces.
- [x] **Extension Functions**.
- [x] **Inner Classes**.
- [ ] Manipulação de coleções (em andamento).

## ⚙️ Como Executar

Para rodar os exercícios localmente, você precisará do JDK instalado e, preferencialmente, uma IDE como IntelliJ IDEA.

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/treino-kotlin.git
   ```
2. Importe o projeto como um projeto Gradle.
3. Para executar via terminal:
   ```bash
   ./gradlew run
   ```
   *(Nota: Certifique-se de configurar a `mainClass` no `build.gradle.kts` se desejar usar o comando run do Gradle, ou execute diretamente os arquivos `.kt` via IDE).*

---
Desenvolvido por [José Elias](https://github.com/joseelias14)
