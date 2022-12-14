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
           bat """ type pipes/vars/saludo.groovy """
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