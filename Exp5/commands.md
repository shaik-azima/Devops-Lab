# MacOS commands

set -e

# 1. Compile the Java program
javac Exp5/HelloWorld.java

# 2. Create a deployment directory
mkdir -p deployed-app

# 3. Copy the compiled application
cp Exp5/HelloWorld.class deployed-app/

# 4. Run the deployed application
java -cp deployed-app HelloWorld

#Windows commands

# Under Build Steps, select Execute Windows batch command and enter:

@echo off
setlocal

REM 1. Compile the Java program
javac Exp5\HelloWorld.java
if errorlevel 1 exit /b 1

REM 2. Create deployment directory
if not exist deployed-app mkdir deployed-app

REM 3. Copy compiled application
copy /Y Exp5\HelloWorld.class deployed-app\

REM 4. Run the deployed application
java -cp deployed-app HelloWorld
if errorlevel 1 exit /b 1
