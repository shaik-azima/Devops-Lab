# Exp11 – JavaScript Testing Using Selenium

## 1. Open Exp11 Folder
```bash
cd ~/Desktop/Devops-Lab/Exp11
code .
```

## 2. Create Maven Project
```bash
mvn archetype:generate \
  -DgroupId=com.devops \
  -DartifactId=Exp11 \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
```

## 3. Enter Maven Project Folder
```bash
cd Exp11
```

## 4. Check Project Files
```bash
ls
```

## 5. Download Dependencies
```bash
mvn dependency:resolve
```

## 6. Run Selenium Test
```bash
mvn clean test
```

## 7. Check Current Directory
```bash
pwd
```

## 8. Check Test Report
```bash
cat target/surefire-reports/com.devops.AppTest.txt
```

## Expected Output
```text
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## Files Used
- `program.html` – JavaScript program with an Increment button.
- `pom.xml` – Maven configuration with Selenium and JUnit dependencies.
- `src/test/java/com/devops/AppTest.java` – Selenium test case.
- `commands.md` – Commands used for the experiment.

## Result
The Selenium test successfully opens Chrome, clicks the Increment button, verifies that the displayed value changes from 0 to 1, and closes the browser.
