[Não fala inglês? Clique aqui](https://github.com/Lucasgmendonca/Appium-Mobile-Testing-With-Cucumber-and-Java/blob/main/README-pt.md)

# Mobile Testing with Appium, Cucumber and Java

This repository contains a mobile test automation project using Appium, Cucumber, and Java, focused on testing the checkout process of an e-commerce application. The test simulates user behavior by navigating through the app, adding products to the cart, and completing the purchase.

---

## Technologies Used
- **Appium**: For automating mobile device testing.
- **Cucumber**: For defining test scenarios in BDD format.
- **Java**: Programming language used to write the tests.
- **JUnit**: Test framework for execution and reporting.
- **Maven**: Dependency management tool.
- **TestNG**: Test framework for execution control.
- **Selenium**: For interacting with UI elements.

---

## Functionality
The test flow simulates the following steps in the e-commerce app:

1. The user logs in by entering their name, selecting their gender, and choosing their country.
2. The user navigates through product options and adds two items to the cart.
3. The user accesses the cart, reviews the added products, and agrees to the terms to complete the purchase.
4. The purchase is successfully finalized.

---

## Project Structure
The project follows a BDD (Behavior Driven Development) approach using Cucumber, and the tests are written in Java. The project structure is organized as follows:

- **Pages**: Contains classes representing the app pages, such as login, products, and cart.
- **StepDefinitions**: Contains Cucumber test steps, representing interactions with the pages.
- **Utils**: Contains utility classes for configuring and managing Appium, such as the BaseTest class that initializes the driver.
- **Features**: Contains .feature files describing test scenarios in Gherkin format.
- **Runners**: Contains the TestRunner class to execute Cucumber tests.

---

## How to Run the Project

### Prerequisites
Ensure the following components are installed:

- **Appium**: Tool for mobile device automation.
- **Node.js**: Required for Appium.
- **Android Studio**: To emulate an Android device.
- **Java JDK** (version 8 or higher).
- **Maven**: Dependency management tool.
- **Cucumber**: For writing tests in Gherkin format.

### Steps to Execute

1. **Launch the Emulator**
   Ensure the device emulator (or physical device) is active and properly configured to run the project.

2. **Start the Appium Server**
   Run the following command in the terminal:
   
   ```bash
   appium

3. **Clone the Repository**  
   Clone the project repository::

   ```bash
   git clone https://github.com/seu-usuario/Appium-Mobile-Testing-With-Cucumber-and-Java.git
   ```

   ### Install Dependencies
   Navigate to the project directory and install dependencies:

   ```bash
   mvn install
   ```
4. **Run the Tests via IDE**
    - Navigate to the `TestRunner.java` file in the appropriate directory.
    - Right-click on the file.
    - Select the 'Run Tests' option (or equivalent in your IDE).

   Test results will be generated in the following directories:
   
      ```bash
      target/cucumber-reports
      target/cucumber.json
      target/cucumber.xml
