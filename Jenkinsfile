pipeline {
  agent { label 'linux' }   // 리눅스 라벨 노드에서 실행
  stages {
    stage('Checkout'){ steps { checkout scm } }
    stage('Build in Docker'){
      agent {
        docker {
          image 'gradle:8.10.2-jdk17'
          reuseNode true
        }
      }
      steps {
        sh 'gradle --version || ./gradlew --version || true'
        sh './gradlew clean test build --no-daemon'
      }
    }
  }
}
