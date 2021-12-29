pipeline {
    agent {
        docker {
            image 'maven:3-jdk-11-slim'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
    }
    post {
        always {
          cleanWs(cleanWhenAborted: true,
                  cleanWhenFailure: true,
                  cleanWhenNotBuilt: false,
                  cleanWhenSuccess: true,
                  deleteDirs: true,
                  disableDeferredWipeout: true,
                  notFailBuild: true)
        }
        changed {
            script {
                emailext subject: '$DEFAULT_SUBJECT',
                    body: '$DEFAULT_CONTENT',
                    recipientProviders: [
                        [$class: 'CulpritsRecipientProvider'],
                        [$class: 'DevelopersRecipientProvider'],
                        [$class: 'RequesterRecipientProvider']
                    ],
                    replyTo: '$DEFAULT_REPLYTO',
                    to: '$DEFAULT_RECIPIENTS'
            }
        }
    }
}
