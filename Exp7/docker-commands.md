# Experiment 7: Docker Containerized Application

## Aim
Develop a simple containerized application using Docker.

## Application
Python program that prints "Hello World from Docker Container!"

## Docker Commands Used

### 1. Build the Docker image
```bash
docker build -t myimage .
```
Builds an image named myimage using the Dockerfile in the current directory.

### 2. Run the container
```bash
docker run --name mycontainer myimage
```
Creates and runs a container named mycontainer.

### 3. View container logs
```bash
docker logs mycontainer
```
Displays the application's output.

### 4. List all containers
```bash
docker ps -a
```
Displays running and stopped containers.

### 5. List Docker images
```bash
docker images
```
Displays the available Docker images.

## Expected Output
```text
Hello World from Docker Container!
```

## Result
Successfully built a Docker image, ran a containerized Python application, and verified its output.
