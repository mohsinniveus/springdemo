
mvn clean install
mvn eclipse:eclipse

Deploying app into kubernetes cluster
kubectl apply -f k8/deployment.yaml
kubectl apply -f k8/service.yaml

Creating GKE cluster and deploying
gcloud container clusters create gkeclusterdemo --machine-type n1-standard-2 --num-nodes 2 --zone asia-south1-a
gcloud container clusters list
gcloud container clusters get-credentials gkeclusterdemo --zone asia-south1-a --project tech-rnd-project
gcloud container clusters delete gkeclusterdemo --zone asia-south1-a