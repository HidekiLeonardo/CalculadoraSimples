# Calculadora Simples em Java

## Descrição
Este é um projeto básico de calculadora em Java, desenvolvido como parte de estudos de programação. A calculadora permite que o usuário realize operações aritméticas simples (adição, subtração, multiplicação e divisão) entre dois números, além de trocar os valores inseridos e encerrar a aplicação.

## Funcionalidades
- **Adição:** Soma dois números inteiros.
- **Subtração:** Subtrai o segundo número do primeiro.
- **Multiplicação:** Multiplica dois números inteiros.
- **Divisão:** Divide o primeiro número pelo segundo. Inclui verificação para divisão por zero.
- **Trocar Valores:** Permite que o usuário insira novos valores sem encerrar o programa.
- **Encerrar:** Fecha a calculadora.

## Estrutura do Projeto
Este projeto contém uma classe principal `Main` com os seguintes métodos:
- `Somar(int n1, int n2)`: Retorna a soma de dois números.
- `Subtrair(int n1, int n2)`: Retorna a diferença entre dois números.
- `Multiplicar(int n1, int n2)`: Retorna o produto de dois números.
- `Dividir(int n1, int n2)`: Retorna o quociente entre dois números (como `double`) e verifica divisão por zero.

### Exemplo de Uso
```java
// Exemplo de execução no terminal:
======= Bem-vindo(a) a minha Calculadora simples =======

Digite o primeiro número: 10
Digite o segundo número: 5

Selecione uma das opções:
1. Adição
2. Subtração
3. Multiplicação
4. Divisão
5. Trocar valores
6. Encerrar

Opção: 1
Resultado da adição: 15
