pipeline {
  agent {
    docker {
      image 'gradle:8.10.2-jdk17'
      // 필요하면 추가 옵션
      // args '-v $HOME/.gradle:/home/gradle/.gradle'
      reuseNode true
    }
  }

  stages {
    stage('Gradle Build') {
      steps {
        sh 'gradle --version || true'   // 컨테이너 내부 gradle 확인 (optional)
        sh 'chmod +x gradlew || true'
        sh './gradlew clean test build --no-daemon'
      }
    }
  }
}
