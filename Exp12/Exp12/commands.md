# Experiment 12 – Selenium Testing of a Containerized Application

## 1. Navigate to the project directory

```bash
cd ~/Desktop/Devops-Lab
mkdir Exp12
cd Exp12
```

## 2. Create the Maven project

```bash
mvn archetype:generate \
  -DgroupId=com.devops \
  -DartifactId=Exp12 \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
```

```bash
cd Exp12
```

## 3. Locate the Maven project file

```bash
find . -name pom.xml
```

## 4. Find Java files

```bash
find . -name "*.java"
```

## 5. Rename the Selenium test file

```bash
mv src/test/java/com/devops/Maintest.java src/test/java/com/devops/MainTest.java
```

## 6. Copy the webpage from Experiment 11

```bash
cp ../../Exp11/program.html .
```

## 7. Build the Docker image

```bash
docker build -t exp12-app .
```

## 8. Run the Docker container

```bash
docker run -d --name exp12-container -p 8080:80 exp12-app
```

## 9. Check running containers

```bash
docker ps
```

## 10. Run Selenium test cases

```bash
mvn clean test
```

## 11. View test results

```bash
cat target/surefire-reports/*.txt
```

## 12. Stop the Docker container

```bash
docker stop exp12-container
```

## Expected result

- Docker container runs the webpage.
- Selenium opens Chrome and executes the test cases.
- Maven reports `BUILD SUCCESS`.
- Both tests pass with zero failures and errors.
