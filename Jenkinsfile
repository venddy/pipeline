pipeline {
  agent any
  tools { 
      maven 'Maven_Home' 
      jdk11 'JAVA_HOME' 
    }
  stages {
    stage('checkout') {
      steps{
       git "https://github.com/venddy/pipeline.git"
      }
    }
  
  stage('Build'){
    steps{
            bat 'mvn clean install'
    }
    
  }
  stage('test'){
    steps{
        bat 'mvn test'
    }
  }
}
}