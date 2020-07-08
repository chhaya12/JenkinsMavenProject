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
         mvnHome = tool 'M3'
        withEnv(["MVN_HOME=$mvnHome"]) {
        bat(/"%MVN_HOME%\bin\mvn" package /)
        }
       // bat "mvn package"
      }
    }
  }
}
