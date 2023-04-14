pipeline {
  agent any
  
  stages {
    stage('checkout') {
      git "https://github.com/venddy/venkatareddy.git"
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
  
