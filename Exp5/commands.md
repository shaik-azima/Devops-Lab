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
javac Exp5/HelloWorld.java || exit 1

mkdir -p deployed-app

cp Exp5/HelloWorld.class deployed-app/

java -cp deployed-app HelloWorld || exit 1

# For Windows (Jenkins → Execute Windows batch command), use these commands:
javac Exp5\HelloWorld.java
if errorlevel 1 exit /b 1

mkdir deployed-app

copy /Y Exp5\HelloWorld.class deployed-app\

java -cp deployed-app HelloWorld
if errorlevel 1 exit /b 1
