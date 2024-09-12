def doc() {
  
            sh 'ls -ltr'
          // build the project and create a JAR file
           sh 'cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && docker build -t dutt1/2app:v1 .'
           
}
