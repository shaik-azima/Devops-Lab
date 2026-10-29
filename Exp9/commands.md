# Experiment 9 – Kubernetes Deployment Commands

## 1. Navigate to the Experiment 9 folder

```bash
cd ..
cd Exp9
pwd
ls
```

## 2. Deploy the application

```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```

## 3. Check the pods

```bash
kubectl get pods -l app=myapp
```

## 4. Check the service

```bash
kubectl get services myapp-service
```

## 5. Display deployment details

```bash
kubectl describe deployment myapp
```

## 6. View application logs

```bash
kubectl logs -l app=myapp --tail=10
```

## 7. Verify the deployment

```bash
kubectl get deployment myapp
kubectl get pods -l app=myapp
kubectl get service myapp-service
```

## Result

The Kubernetes deployment was successful. Three replicas were created and all three pods reached the `Running` state. The `myapp-service` ClusterIP service was also created successfully.

**Image used:** `nginx:latest`

**Replicas:** 3

**Service type:** ClusterIP

**Container port:** 80
