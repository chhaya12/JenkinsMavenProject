pipeline {
  agent any
  stages{
    stage("Cleaning Stage"){
      steps {
                mvnHome = tool 'M3'
        withEnv(["MVN_HOME=$mvnHome"]) {
        bat(/"%MVN_HOME%\bin\mvn" clean /)
        }
        //bat "mvn clean"
      }
    }
    stage("Testing Stage"){
      steps {
         mvnHome = tool 'M3'
        withEnv(["MVN_HOME=$mvnHome"]) {
        bat(/"%MVN_HOME%\bin\mvn" test /)
        }
       // bat "mvn test"
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
