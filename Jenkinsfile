pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /home/ci/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
    }
}