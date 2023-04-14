pipeline {
  agent any
  
  stages {
    stage('checkout') {
      steps{
       git "https://github.com/venddy/pipeline.git"
      }
    }
  
  stage('Build'){
    steps{
            sh 'mvn clean install'
    }
  }
  stage('test'){
    steps{
        sh 'mvn test'
    }
  }
}
