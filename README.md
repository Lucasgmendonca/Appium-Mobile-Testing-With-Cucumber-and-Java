# Teste mobile Appium com Cucumber e Java

Este repositório contém um projeto de automação de testes móveis utilizando Appium, Cucumber e Java, focado em testar o processo de checkout de um aplicativo de e-commerce. O teste simula o comportamento do usuário ao navegar pelo aplicativo, adicionar produtos ao carrinho e finalizar a compra.

---

## Tecnologias Utilizadas
- **Appium**: Utilizado para automação de testes em dispositivos móveis.
- **Cucumber**: Utilizado para definir cenários de teste no formato BDD.
- **Java**: Linguagem de programação utilizada para escrever os testes.
- **JUnit**: Framework de testes utilizado para execução e relatórios.
- **Maven**: Gerenciador de dependências.
- **TestNG**: Framework de testes para controle de execução.
- **Selenium**: Utilizado para interação com elementos da interface do usuário.

---

## Funcionalidade
O fluxo de teste simula as seguintes etapas no aplicativo de e-commerce:

1. O usuário faz login inserindo seu nome, selecionando o gênero e o país.
2. O usuário navega pelas opções de produtos e adiciona dois produtos ao carrinho.
3. O usuário acessa o carrinho, verifica os produtos adicionados e concorda com os termos para finalizar a compra.
4. A compra é finalizada com sucesso.

---

## Estrutura do Projeto
O projeto segue uma abordagem de automação de testes utilizando o BDD (Behavior Driven Development) com o Cucumber, e os testes são escritos em Java. A estrutura do projeto é organizada da seguinte forma:

- **Pages**: Contém as classes que representam as páginas do aplicativo, como login, produtos e carrinho.
- **StepDefinitions**: Contém os passos de teste do Cucumber, que representam as interações com as páginas.
- **Utils**: Contém classes utilitárias para configurar e controlar o Appium, como a classe BaseTest que inicializa o driver.
- **Features**: Contém os arquivos `.feature` que descrevem os cenários de teste em formato Gherkin.
- **Runners**: Contém a classe `TestRunner` que executa os testes Cucumber.

---

## Como Rodar o Projeto

### Pré-requisitos
Certifique-se de ter os seguintes componentes instalados:

- **Appium**: Ferramenta de automação para dispositivos móveis.
- **Node.js**: Requisito para o Appium.
- **Android Studio**: Para emular um dispositivo Android.
- **Java JDK** (versão 8 ou superior).
- **Maven**: Gerenciador de dependências.
- **Cucumber**: Para escrita de testes em formato Gherkin.

### Como Executar

1. **Abra o Emulador**
   Certifique-se de que o emulador de dispositivo (ou dispositivo físico) está ativo e configurado para rodar o projeto.

2. **Inicie o Servidor Appium**
   No terminal, execute o comando:
   
   ```bash
   appium

3. **Clone o Repositório**  
   Faça o clone do repositório do projeto:

   ```bash
   git clone https://github.com/seu-usuario/Appium-Mobile-Testing-With-Cucumber-and-Java.git
   ```

   ### Instale as Dependências
   Navegue até o diretório do projeto e instale as dependências:

   ```bash
   mvn install
   ```
4. **Executando os Testes via IDE**
    - Navegue até o arquivo `TestRunner.java` no diretório correspondente.
    - Clique com o botão direito sobre o arquivo.
    - Selecione a opção 'Run Tests' (ou equivalente na sua IDE).

   Os resultados dos testes serão gerados nos seguintes diretórios:
   
      ```bash
      target/cucumber-reports
      target/cucumber.json
      target/cucumber.xml
