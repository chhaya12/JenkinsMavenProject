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
    stage("Consolidated Results"){
      steps {
        input("Do You want to capture a results ?")
        junit'**/target/surfire-reports/TEST-*.xml'
        archive'target/*.jar'
      }
    }
    
  }
}
