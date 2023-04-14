pipeline {
  agent any

    tools {
        // Define a Maven installation with the name "Maven"
        maven 'Maven'
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