# Selenium WebDriver - Website Testing

## Overview

This project demonstrates how to automate website testing using Selenium WebDriver with Java. The script interacts with a web form by entering user details and submitting the form.

## Prerequisites

- Java Development Kit (JDK)
- Selenium WebDriver
- ChromeDriver
- An IDE (e.g., Eclipse, IntelliJ IDEA)

## Setup

1. **Install Java:**
   Make sure you have the JDK installed. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK.

2. **Download Selenium WebDriver:**
   Download the Selenium Java client from the [Selenium website](https://www.selenium.dev/downloads/).

3. **Download ChromeDriver:**
   - Download the ChromeDriver that matches your version of Google Chrome from [ChromeDriver Downloads](https://chromedriver.chromium.org/downloads).
   - Place the `chromedriver.exe` file in a directory, e.g., `C:\SELENIUM\chromedriver-win64\`.

4. **Add Selenium and ChromeDriver to your Project:**
   - Include the Selenium JAR files in your project’s build path.
   - Set the system property for ChromeDriver in your code.

## Code Explanation

```java
package seleniumbasic;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://coe1.annauniv.edu/home/");
        driver.findElement(By.id("register_no")).sendKeys("XXXXXXXXXXXX");
        Thread.sleep(2000);
        driver.findElement(By.name("dob")).sendKeys("XXXXX");
        Thread.sleep(2000);
        
        System.out.print("Captcha:");
        Scanner sc = new Scanner(System.in);
        String captachavalue = sc.nextLine();
        WebElement captachainput = driver.findElement(By.name("security_code_student"));
        captachainput.sendKeys(captachavalue);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/div/div[4]/div/div[2]/form/div/div[4]/input")).click();
        Thread.sleep(2000);
    }
}

Here's a README.md template for your Selenium WebDriver program:

markdown
Copy code
# Selenium WebDriver - Website Testing

## Overview

This project demonstrates how to automate website testing using Selenium WebDriver with Java. The script interacts with a web form by entering user details and submitting the form.

## Prerequisites

- Java Development Kit (JDK)
- Selenium WebDriver
- ChromeDriver
- An IDE (e.g., Eclipse, IntelliJ IDEA)

## Setup

1. **Install Java:**
   Make sure you have the JDK installed. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK.

2. **Download Selenium WebDriver:**
   Download the Selenium Java client from the [Selenium website](https://www.selenium.dev/downloads/).

3. **Download ChromeDriver:**
   - Download the ChromeDriver that matches your version of Google Chrome from [ChromeDriver Downloads](https://chromedriver.chromium.org/downloads).
   - Place the `chromedriver.exe` file in a directory, e.g., `C:\SELENIUM\chromedriver-win64\`.

4. **Add Selenium and ChromeDriver to your Project:**
   - Include the Selenium JAR files in your project’s build path.
   - Set the system property for ChromeDriver in your code.

## Code Explanation

```java
package seleniumbasic;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\SELENIUM\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://coe1.annauniv.edu/home/");
        driver.findElement(By.id("register_no")).sendKeys("XXXXXXXXXXXX");
        Thread.sleep(2000);
        driver.findElement(By.name("dob")).sendKeys("XXXXX");
        Thread.sleep(2000);
        
        System.out.print("Captcha:");
        Scanner sc = new Scanner(System.in);
        String captachavalue = sc.nextLine();
        WebElement captachainput = driver.findElement(By.name("security_code_student"));
        captachainput.sendKeys(captachavalue);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("/html/body/div/div[4]/div/div[2]/form/div/div[4]/input")).click();
        Thread.sleep(2000);
    }
}
Code Breakdown
Package Declaration: Organizes related classes.
Imports: Includes necessary Java and Selenium classes.
Main Class: Contains the main method, which is the entry point of the program.
WebDriver Setup: Initializes ChromeDriver and navigates to the target website.
Element Interaction: Finds and interacts with various web elements, including entering user details and captcha.
Form Submission: Clicks the submit button to submit the form.
Running the Program
Compile the Java file using your IDE or command line.
Run the program. Follow the prompt to enter the captcha when required.
Observe the automation process as the form is filled and submitted.
License
This project is licensed under the MIT License - see the LICENSE file for details.

sql
Copy code

Feel free to modify any sections as needed to fit your specific project requirements!





