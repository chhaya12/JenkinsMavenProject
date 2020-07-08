pipeline {
  agent any
  tools {
        maven 'M3' 
    }
  stages{
    stage("Cleaning Stage"){
      steps {

        bat "mvn clean"
      }
    }
    stage("Testing Stage"){
      steps {

        bat "mvn test"
      }
    }
    stage("Packaging Stage"){
      steps {

        bat "mvn package"
      }
    }
  }
}
