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
        junit '**/target/surefire-reports/TEST-*.xml'
        archive 'target/*.jar'
      }
    }
    stage("Email Build status"){
      steps {
        mailbody:"${env.JOB_NAME}-Build#${env.BUILD_NUMBER}-${currentBuild.currentResult}\n\ncheck console output at${env.BUILD_URL}to view the results.", to:'chhaya.agarwal@gmail.com'
      }
    }
    
  }
}
