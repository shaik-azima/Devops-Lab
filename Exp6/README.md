# Experiment 6: Docker Commands for Container Management

## Aim
To explore and execute Docker commands for managing images and containers.

## Requirements
- MacBook Air M1
- Docker Desktop
- Terminal
- Docker Hub account

## Commands Executed

### 1. Check Docker Version
```bash
docker --version
```
Displays the installed Docker version.

### 2. Download an Image
```bash
docker pull ubuntu:latest
```
Downloads the latest Ubuntu image from Docker Hub.

### 3. List Docker Images
```bash
docker images
```
Displays the Docker images available locally.

### 4. Create and Run a Container
```bash
docker run -it --name mycontainer ubuntu:latest bash
```
Creates and starts an interactive container using the Ubuntu image.

### 5. Check the Operating System
Inside the container, execute:
```bash
cat /etc/os-release
```
Displays information about the operating system inside the container.

### 6. Exit the Container
```bash
exit
```
Exits the interactive container terminal.

### 7. List Containers
```bash
docker ps -a
```
Lists all containers, including stopped containers.

### 8. Stop a Container
```bash
docker stop mycontainer
```
Stops the specified running container.

### 9. Remove a Container
```bash
docker rm mycontainer
```
Removes the stopped container.

### 10. Start and Stop an Existing Container
```bash
docker start welcome-to-docker
docker stop welcome-to-docker
```
Starts and stops the existing container named `welcome-to-docker`.

### 11. Log In to Docker Hub
```bash
docker login
```
Authenticates the user with Docker Hub.

### 12. Tag an Image
Replace `YOUR_USERNAME` with your Docker Hub username.
```bash
docker tag ubuntu:latest YOUR_USERNAME/exp6-ubuntu:latest
```
Assigns a repository name and tag to the local Ubuntu image.

### 13. Push an Image to Docker Hub
```bash
docker push YOUR_USERNAME/exp6-ubuntu:latest
```
Uploads the tagged image to Docker Hub.

## Result
Successfully explored Docker commands for downloading images, creating and managing containers, and uploading a Docker image to Docker Hub.
