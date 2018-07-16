pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v maven-m2-volume:/root/.m2'
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