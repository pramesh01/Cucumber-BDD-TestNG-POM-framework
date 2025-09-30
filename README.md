# Selenium_Java_Cucumber-BDD-Framework_Project

## Overview
- This project is an **Automation Framework** using **selenium with Java** , built for implementing **Behavior Driven Development (BDD)** using **Cucumber**.  
- The framework is designed following **industry-standard practices** and **modular design principles**, making it **scalable, maintainable, and easy to extend**.  

- The framework is built for the demo website: [http://www.automationpractice.pl/index.php](http://www.automationpractice.pl/index.php).  

## Used following Tech skills while creating the Framework:

![Java](https://img.shields.io/badge/Java-17-orange)  
![Selenium](https://img.shields.io/badge/Selenium-Automation-brightgreen)  
![TestNG](https://img.shields.io/badge/TestNG-Testing-blue)  
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-success)  
![Maven](https://img.shields.io/badge/Maven-Build-red)  
![ExtentReports](https://img.shields.io/badge/ExtentReports-Reporting-green)  
![LambdaTest](https://img.shields.io/badge/LambdaTest-CrossBrowserTesting-blueviolet?logo=lambdatest)  
![Selenium Grid](https://img.shields.io/badge/Selenium-Grid-yellowgreen?logo=selenium)  
![Docker](https://img.shields.io/badge/Docker-Containerization-blue?logo=docker)  
![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-red?logo=jenkins) 

---

Currently, it implements the following functionalities:  

- **Login functionality** (Valid & Invalid credentials)  
- **Data-driven login tests** using `.feature` files  
- **Search product functionality** after logging in  
- **Logout functionality**
- **Add to Cart** functionality  
- **Complete Checkout process (end-to-end)**

Future enhancements planned:  

- Selenium GRID for parallel execution  
- CI/CD integration using Jenkins  

---

## Features Implemented ✅

- **Login Scenarios**
  - Valid credentials  
  - Invalid credentials  
  - Scenario Outline with multiple sets of credentials (Data-driven)  

- **Search Product** functionality after login  
- **Logout functionality**  
- **Add to Cart** functionality  
- **Complete Checkout process (end-to-end)**  

### Framework Highlights
- **Page Object Model (POM)** design pattern  
- **TestNG** integration for test execution  
- **Cucumber BDD** with `.feature` files  
- **ExtentReports** integration  
  - Step-wise logging in reports  
  - Screenshot capture on failures  
- **Reusable Utilities and Helpers**  
  - TestContext for managing WebDriver instances  
  - PicoContainer for dependency injection  
  - Wait utilities, reusable methods, and helper functions  

---

## Tech Stack 🛠️

- **Programming Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Testing Framework:** TestNG  
- **BDD Framework:** Cucumber  
- **Build Tool:** Maven  
- **Reporting:** ExtentReports  
- **Design Pattern:** Page Object Model (POM)  
- **Cross-Browser Testing:** LambdaTest

---

## Project Structure

📁 **Selenium_Java_Cucumber-BDD-Framework_Project**
- 📁 **src**
  - 📁 **main**
    - 📁 **java**
      - 📁 **pageclasses** – Page Object Model classes
      - 📁 **manager**
        - 📄 **PageClassManager.java** – Manages and provides single instances of all Page Object classes (to avoid multiple object creation and improve maintainability
        - 📄 **WebDriverManager.java** – Handles centralized WebDriver initialization, browser setup, and driver lifecycle management
      - 📁 **utils** – Reusable functions and helper utilities
    - 📁 **resources**
      - 📄 **project.properties** – Configuration and test data
  - 📁 **test**
    - 📁 **java**
      - 📁 **context** – **TestContext** for sharing data across steps
      - 📁 **stepdefinitions** – Step definitions for BDD scenarios
      - 📁 **hooks** – Before/After hooks for setup and teardown
      - 📄 **Runner.java** – TestNG Cucumber runner class to execute feature files and manage scenarios
    - 📁 **resources**
      - 📁 **features** – Cucumber feature files
- 📁 **Reports** – ExtentReports output  
- 📁 **test-output** – TestNG results  
- 📄 **pom.xml** – Maven build file  
- 📄 **README.md** – Project documentation  

## How to Run the Framework 🏃‍♂️

1. **Clone the repository**
```bash
- git clone https://github.com/pramesh01/Cucumber-BDD-TestNG-POM-framework.git

- Navigate to project directory and run tests using Maven, as following :
  
  - mvn clean test

```
Reports
- After execution, detailed ExtentReports with step logs and screenshots for failures are generated in the Reports/ folder.

## Future Enhancements ⚡
- CI/CD Integration using Jenkins
- Parameterization for running tests from CMD with different environments/datasets
- Parallel execution using Selenium Grid via Maven Surefire plugin
- Docker Integration for containerized test execution

## Why This Framework Stands Out:
- Modular & Scalable: Built using POM, easy to extend for future features
- Modern Automation Practices: BDD with Cucumber, TestNG, Maven, ExtentReports
- Reusable Components: Utilities, TestContext, PicoContainer integration
- Industry Standard: Well-structured project aligned with real-world automation requirements
- Reporting & Logging: Step-wise logs with screenshots for failures, making debugging easier

## Author:
Pramesh Kumar
- Email: pramesh.cs@gmail.com