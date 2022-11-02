import groovy.json.JsonSlurper

def call() {
  pipeline {
    agent {
      node {
        label 'master'
      }
    }

  stages {
      stage('Dieguini ') {
      steps {
           bat """ git clone https://github.com/Flezxfp/JenkinsLibs.git"""  
           bat """ type C:\Users\din_c\Documents\TestCLI\JenkinsLibs\vars\saludo.groovy """
          // bat """cd"""
        }

  post {
    success { 
      echo 'Construccion exitosa....'
          }

    failure {
      echo 'Parece que algo no salio Bien....'
          }
    always {
            cleanWs()
          }
        }
      }
    }
  }
}
