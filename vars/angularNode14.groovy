import groovy.json.JsonSlurper

def call(env) {
  final MASTER = 'master'

  pipeline {
    agent {
      node {
        label MASTER
      }
    }

    // environment {
    //   ANGULARN_NODE14_GITREPO = credentials('AngularN-Node14-GitRepo')
    // }

    stages {
      stage('Identificación de la Rama') {
        steps {
          script {
             echo 'Hola mundo....'
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