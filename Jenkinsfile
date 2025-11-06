pipeline {
  agent { docker { image 'gradle:8.10.2-jdk17' reuseNode true } }

  stages {
    stage('Init sample project') {
      steps {
        sh '''
          rm -rf demo && mkdir demo && cd demo
          gradle init --type java-application --dsl groovy --test-framework junit --project-name demo --package demo -q
        '''
      }
    }
    stage('Build & Test') {
      steps {
        sh 'cd demo && ./gradlew clean build --no-daemon --info'
      }
    }
  }
  post {
    success { echo '✅ Jenkins 로컬 파이프라인 성공' }
    failure { echo '❌ 실패 - 콘솔 로그 확인' }
  }
}
