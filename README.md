# Projeto de Cálculo da Velocidade Média de Internet - Java

Este projeto é uma aplicação simples em Java que solicita ao usuário uma lista de velocidades de conexão da internet e calcula a média dessas velocidades, exibindo o resultado em Mbps. A aplicação utiliza métodos básicos de manipulação de `String` e conversão de dados com o objetivo de exemplificar o uso de entrada de dados via terminal e manipulação de arrays.

## Funcionalidades Principais

### Entrada de Dados do Usuário
- Solicita ao usuário uma lista de velocidades de conexão de internet separadas por vírgula (`,`).

### Cálculo da Velocidade Média
- Converte as entradas para inteiros, calcula a soma e divide pelo total de entradas para obter a média.

### Exibição da Velocidade Média
- Exibe o valor arredondado da velocidade média de conexão em Mbps.

## Estrutura do Projeto

### Classes e Métodos

- **VelocidadeMediaInternet.java**
  - `calcularVelocidadeMedia(String[] velocidades)`: Método que recebe um array de `String`, converte os valores para inteiros, calcula a soma e devolve a média.
  - `main(String[] args)`: Método principal que solicita as entradas do usuário, executa o cálculo da média e exibe o resultado.

## Exemplos de Uso

Para calcular a média das velocidades fornecidas, execute o programa e insira as velocidades separadas por vírgula quando solicitado. Por exemplo:

## Tecnologias Utilizadas

- **Java 8 ou superior:** Utilizado para o desenvolvimento do projeto.
- **Scanner (java.util.Scanner):** API utilizada para captura de entrada do usuário no terminal.

## Como Executar o Projeto

1. Clone este repositório.
2. Compile e execute o arquivo `VelocidadeMediaInternet.java` em seu ambiente de desenvolvimento Java.
3. Insira as velocidades de conexão quando solicitado e verifique o resultado da média exibido no console.

## Autor

- **Lucas Degrande**

```shell
Digite as velocidades da internet, separadas apenas por vírgula ',':
120,130,125,125,120,130

```shell
125