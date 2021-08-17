mvn clean install -DskipTests

docker image build -t gcr.io/niveusanthos/springdemo:v5 .
docker push gcr.io/niveusanthos/springdemo:v5

#set up mysql inside the cluster
kubectl apply -f k8s/mysql/mysql-deployment.yaml
kubectl apply -f k8s/mysql/mysql-pv.yaml

kubectl run -it --rm --image=mysql:5.6 --restart=Never mysql-client -- mysql -h mysql -p<password>
mysql>create database test;



kubectl apply -f k8s/se.yaml
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml

Rest API are exposed on node-port

start minikube
minikube start --cpus 4 --memory 8192

view all transaction
headers
Content-Type application/json
http://192.168.49.2:30081/viewAll

create a transaction
http://192.168.49.2:30081/create
{
    "fromAccount": "12345678",
    "toAccount":"78901234",
    "amount":200
}


