mvn clean install -DskipTests

docker image build -t gcr.io/niveusanthos/springdemo:v5 .
docker push gcr.io/niveusanthos/springdemo:v5

kubectl apply -f k8s/mysql/mysql-deployment.yaml
kubectl apply -f k8s/mysql/mysql-pv.yaml


kubectl apply -f k8s/se.yaml
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
