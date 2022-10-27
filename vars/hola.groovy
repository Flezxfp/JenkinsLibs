import groovy.json.JsonSlurper

def call(env) {
  final MASTER = 'master'

  pipeline {
    agent {
      node {
        label MASTER
      }
    }

    stages {
      stage('Saludo') {
        steps {
          script {
             cat Holamundo.txt
          }
        }
      }
    }

    post {
      success {
        echo 'Sucess....'
         
      }

      failure {
        echo 'Failure.....'

      }
      always {
           echo 'Always......'
      }
    }
  }
}
