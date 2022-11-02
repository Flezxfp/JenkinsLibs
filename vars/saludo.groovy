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
          //  bat """ type pipes/vars/saludo.groovy """
          bat """pwd"""
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
