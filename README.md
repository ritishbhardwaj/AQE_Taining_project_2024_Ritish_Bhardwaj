Welcome to the Selenium Test Automation project! This repository contains various test scripts designed using the Page Object Model (POM) to automate web application testing.

📁 Folder Structure
plaintext
Copy code
src/test/
│
├── script/
│   ├── ExamplePage.java
│   ├── GoogleSearchPage.java
│   ├── QAFormPage.java
│   └── WikipediaPage.java
│
└── test/
    ├── TestExample.java
    ├── TestGoogleSearch.java
    ├── TestQAForm.java
    └── TestWikipedia.java
🚀 How to Run
Setup WebDriver:

Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver for Firefox).
Add the WebDriver executable to your system's PATH or specify its path in the test scripts.
Library Setup:

Add the TestNG and Selenium JAR files directly to your project by placing them in the library folder inside your IntelliJ project.
Running the Tests:

Use IntelliJ's TestNG runner to execute the test cases.
Right-click on the test class in the test package and select Run.
📄 Test Scripts Overview
ExamplePage.java & TestExample.java: Automates navigation and interaction with the example.com website.
GoogleSearchPage.java & TestGoogleSearch.java: Simulates a search on Google and selects a suggested result.
QAFormPage.java & TestQAForm.java: Fills out and submits the QA form on demoqa.com.
WikipediaPage.java & TestWikipedia.java: Automates interactions with language selection and searching on Wikipedia.
📌 Key Features
Page Object Model (POM): The test scripts are organized using POM, making them easy to maintain and scalable.
Cross-Browser Testing: Tests can be executed across multiple browsers by configuring WebDriver.
