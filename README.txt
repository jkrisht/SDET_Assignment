# SDET Assignment Details

Assumptions:
------------

Project Management Tool: Maven
Programming Language: Java
Test Framework: TestNG
Browser: Chrome or Firefox (few Firefox versions are not supporting. Please try to use chrome browser).


Script Execution:
-----------------
1. 'src/test/java/Variables_Locators/Variables.java' - Open 'Variables.java' file and set browser name as chrome or firefox.
2. 'src/test/java/TestScripts/SearchTestScript.java' - Open 'SearchTestScript.java' file and execute 'searchAndVerifyProductDetails' test script by selecting 'Run As' -> 'TestNG Test'
3. Once execution is done, script will print the product details to console.

Note: I have windows PC only. So, I am unable to provice Mac exection details.

Project Details:
----------------

1. 'src/test/java/baseActions/BaseActions.java' - In this class we can have basic action methods link launching browser, locate elements, clicking actions etc.
2. 'src/test/java/TestScripts/SearchTestScript.java' - In this class we will have Test Scripts with 'BeforeMethod' and 'AfterMethod' annotations for launching and closing browsers.
3. 'src/test/java/Variables_Locators/Variables.java' - In this class we will have global variables (browser, environment, domain etc) which we can across the entire project for reusability and less maintainenance purpose.
4. 'src/test/java/Variables_Locators/WebLocators.java' - In this class we will have global Webelement locators. By declaring here, we can achieve reusability of locators and maintainenance will be reduced when element changes.
5. 'src/test/java/WebPages/*' - In this package we will page classes. Here we will declare and implement page dedicated actions (methods) for test scripts.

Note: We can create 'BasePage.java' class file for implementing reusable actions across multiple pages (will reduce code maintenance also).

