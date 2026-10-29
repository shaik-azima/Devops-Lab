
# Experiment 10: Install and Explore Selenium for Automated Testing

## AIM
To install and explore Selenium WebDriver for automated testing.

## SOFTWARE REQUIREMENTS
- Java JDK
- Apache Maven
- Visual Studio Code
- Google Chrome
- Selenium WebDriver

## 1. Check Java and Maven Installation

Commands:

```bash
java -version
mvn -version
```

Google Chrome was already installed on the MacBook.

Note: `google-chrome --version` returned `command not found` on macOS. Chrome was still installed and worked correctly.

## 2. Create the Maven Project

Navigate to the DevOps Lab directory:

```bash
cd ~/Desktop/Devops-Lab
```

Create the experiment folder:

```bash
mkdir Exp10
cd Exp10
```

Generate the Maven project:

```bash
mvn archetype:generate \
  -DgroupId=com.devops \
  -DartifactId=Exp10 \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
```

Output:

```text
BUILD SUCCESS
```

Maven created the project inside another folder named `Exp10`.

## 3. Enter the Actual Project Directory

The first `mvn compile` command failed because the terminal was in the outer folder, which did not contain `pom.xml`.

Error:

```text
The goal you specified requires a project to execute
but there is no POM in this directory.
```

Solution:

```bash
cd Exp10
ls
```

Expected output:

```text
pom.xml
src
target
```

Open the project in VS Code:

```bash
code .
```

IMPORTANT: Run Maven commands from the directory containing `pom.xml`.

## 4. Add Selenium Dependency

Open `pom.xml` and add the following dependency inside the `<dependencies>` section. If the section already exists, add only the `<dependency>` block inside it.

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.38.0</version>
</dependency>
```

Save the file. Maven downloads Selenium and its required libraries.

## 5. Java Program

File location:

`src/main/java/com/devops/App.java`

Program:

```java
package com.devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com");

            String title = driver.getTitle();

            System.out.println("Page Title: " + title);

            if (title.contains("Google")) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
            }

        } finally {
            driver.quit();
        }
    }
}
```

## 6. Compile the Program

Command:

```bash
mvn compile
```

Output:

```text
BUILD SUCCESS
```

## 7. Execute the Selenium Program

Command:

```bash
mvn exec:java -Dexec.mainClass="com.devops.App" -Dexec.cleanupDaemonThreads=false
```

Expected output:

```text
Page Title: Google
TEST PASSED
BUILD SUCCESS
```

## 8. Keep Chrome Open for Demonstration

To keep Chrome open for 10 seconds, add the following line after printing the page title:

```java
Thread.sleep(10000);
```

Also change the main method declaration to:

```java
public static void main(String[] args) throws InterruptedException
```

Run the program again using the Maven execution command. Chrome opens Google and remains visible for 10 seconds before closing.

## 9. Result

Selenium WebDriver was successfully installed and explored. The program opened Google in Chrome, retrieved the page title, verified that it contained the word "Google", printed `TEST PASSED`, and closed the browser automatically.

## 10. Important Notes

1. The missing `pom.xml` error was fixed by entering the inner `Exp10` directory.
2. Selenium Manager automatically managed the browser driver; manually specifying a ChromeDriver path was not necessary.
3. A Chrome DevTools Protocol (CDP) compatibility warning appeared, but the program still executed successfully.
4. Maven may display Java source/target compatibility warnings because the generated project uses an older Java configuration. These warnings did not prevent execution.
5. The same Java code and Maven dependency can be used on Windows, Linux, and macOS, provided the required software is installed.
6. Upload `pom.xml`, `src/`, and `commands.md` to GitHub. The generated `target/` directory is usually not necessary.

## 11. Essential Commands Summary

```bash
java -version
mvn -version

cd ~/Desktop/Devops-Lab
cd Exp10

ls
code .

mvn compile

mvn exec:java -Dexec.mainClass="com.devops.App" -Dexec.cleanupDaemonThreads=false
```
