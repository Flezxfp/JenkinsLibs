import groovy.json.JsonSlurper

def call() {
  pipeline {
    agent {
      node {
        label 'master'
      }
    }

  stages {
      stage('Deigo') {
      steps {
          node('serchWS') {
          //sh ''' git clone "http://ezunigas:OptimusArca@10.51.158.200/gitlab-big/devops/jenkins/pipes.git" '''    
          sh ''' cat pipes/vars/saludo.groovy '''
          }
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