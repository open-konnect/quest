# quest
A free tool to generate QR codes, shortening urls

# Deploy backend service
## Docker
docker build -t quest-backend:latest .
docker tag quest-backend:latest {your-dockerhub-username}/quest-backend:latest
docker push {your-dockerhub-username}/quest-backend:latest

## Docker build directly into Minikube
eval $(minikube docker-env)
docker build -t quest-backend:latest .

## Deploy using Kubernetes
kubectl apply -f kubernetes/quest-backend.yaml
kubectl rollout restart deployment quest-backend

## Check for logs
kubectl get pods -o wide
kubectl logs -f quest-backend-0

# If ingress is not working
minikube addons enable ingress
minikube addons enable ingress-dns