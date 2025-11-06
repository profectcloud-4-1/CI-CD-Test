pipeline {
  agent { docker { image 'alpine:3.19' } }  // 최소 형태, 옵션 없음
  stages {
    stage('check') {
      steps {
        sh 'uname -a'
      }
    }
  }
}
