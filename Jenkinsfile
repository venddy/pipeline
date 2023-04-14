pipeline {
  agent any
  
   tools {
        maven 'Maven 3.6.3'
    }
    
  stages {
    stage('checkout') {
      steps{
       git "https://github.com/venddy/pipeline.git"
      }
    }
  
  stage('Build'){
    steps{
      withMaven(maven: 'Maven 3.6.3', options: []){
            bat 'mvn clean install'
    }
    }
  }
  stage('test'){
    steps{
        bat 'mvn test'
    }
  }
}
}