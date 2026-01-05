#  Conversor de Moeda - Challenge ONE - Java - Back end

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Este projeto é uma aplicação de console em Java que permite converter valores entre diferentes moedas em tempo real. Ele faz parte de um desafio de programação para praticar consumo de APIs, manipulação de JSON e lógica de programação.

## 🚀 Funcionalidades

O sistema oferece um menu interativo com as seguintes opções:
- **Conversões Diretas:**
    - Dólar (USD) para Real (BRL)
    - Real (BRL) para Dólar (USD)
    - Euro (EUR) para Real (BRL)
    - Real (BRL) para Euro (EUR)
- **Conversão Personalizada:** Permite digitar qualquer código de moeda internacional (Ex: GBP, JPY, CAD, etc).
- **Cotação Atualizada:** Os valores são obtidos em tempo real via API externa.

## 🛠️ Tecnologias e Dependências

* **Linguagem:** Java 17+
* **API de Cotações:** [ExchangeRate-API](https://www.exchangerate-api.com/)
* **Biblioteca de JSON:** [Gson](https://github.com/google/gson) (utilizada para converter a resposta da API em objetos Java).

## 📋 Como Funciona a Estrutura

O código está dividido em três pilares principais:

1.  **`Principal.java`**: Gerencia o menu, as entradas do usuário e a exibição dos resultados.
2.  **`ConsultaMoeda.java`**: Responsável pela requisição HTTP e comunicação com a API.
3.  **`DadosMoeda.java`**: Um *Record* que serve como modelo para os dados recebidos da API.

---

## ⚙️ Configuração e Instalação

### 1. Obter uma Chave de API
Para que o programa funcione, você precisa de uma chave gratuita:
1. Acesse [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Cadastre seu e-mail e copie a chave gerada.
3. No seu código `ConsultaMoeda`, substitua o campo da URL pela sua chave.

### 2. Clonar o Repositório
```bash

git clone [https://github.com/seu-usuario/conversor-de-moedas-java.git](https://github.com/seu-usuario/conversor-de-moedas-java.git)
````
### Exemplo de Execução
  - Ao rodar o programa, o fluxo será:

  - O usuário escolhe uma opção (ex: 1).

  - O programa solicita o valor (ex: 100.00).

   O programa exibe:

    Cotação: 5,02 [USD]
    Valor 100,00 [USD] corresponde ao valor final 
       de =>>> 502,00 [BRL]

### 📄 Licença
   Este projeto é para fins educacionais. Sinta-se à vontade para clonar e aprimorar!