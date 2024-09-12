def doc() {
  sh 'cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && docker build -t dutt1/1app:v1 .'
}
