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
  def someMethod() {
    // some code here
}

if (someCondition) {
    // some code here
} else {
    // some code here
}

// other code here

// ensure that all opening braces have a corresponding closing brace
// and that they are in the correct order

