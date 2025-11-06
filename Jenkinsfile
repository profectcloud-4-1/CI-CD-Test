pipeline {
  agent { docker { image 'gradle:8.10.2-jdk17' reuseNode true } }

  stages {
    stage('Checkout') {
      steps { checkout scm }
    }
    stage('Build & Test') {
      steps { sh './gradlew clean build --no-daemon --info' }
      // 윈도우 노드라도 Docker 컨테이너 안에서는 Linux셸이므로 sh 사용
    }
  }
}
