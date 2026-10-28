# Experiment 8: Integrate Docker and Kubernetes

## Docker Commands

### 1. Check Docker version
```bash
docker --version
```

### 2. Build the Docker image
```bash
docker build -t YOUR_USERNAME/exp8-app:1.0 .
```

### 3. List Docker images
```bash
docker images
```

### 4. Log in to Docker Hub
```bash
docker login
```

### 5. Push the image to Docker Hub
```bash
docker push YOUR_USERNAME/exp8-app:1.0
```

### 6. Run the Docker container for testing (optional)
```bash
docker run -d --name exp8-test -p 5000:5000 YOUR_USERNAME/exp8-app:1.0
```

### 7. Stop and remove the test container
```bash
docker stop exp8-test
docker rm exp8-test
```

## Kubernetes Commands

### 1. Check Kubernetes nodes
```bash
kubectl get nodes
```

### 2. Deploy the application
```bash
kubectl apply -f deployment.yaml
```

### 3. Check deployments
```bash
kubectl get deployments
```

### 4. Check pods
```bash
kubectl get pods
```

### 5. Check services
```bash
kubectl get services
```

### 6. Delete the deployment and service (optional cleanup)
```bash
kubectl delete -f deployment.yaml
```

**Note:** Replace `YOUR_USERNAME` with your Docker Hub username before running the Docker commands. The Docker image must be pushed to Docker Hub and the image name in `deployment.yaml` must match.