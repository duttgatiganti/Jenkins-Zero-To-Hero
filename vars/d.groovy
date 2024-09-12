def doc() {
   sh 'cd java-maven-sonar-argocd-helm-k8s/spring-boot-app'
   sh ' docker build -t dutt1/app:v1 .'
}
