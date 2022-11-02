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
<<<<<<< HEAD
           bat """ type pipes/vars/saludo.groovy """
=======

           bat """ git clone https://github.com/Flezxfp/JenkinsLibs.git"""  
          //  bat """ type pipes/vars/saludo.groovy """
          bat """pwd"""
>>>>>>> f6a11df58d54c9d27fbc3032824c2e87a2c7d230
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
