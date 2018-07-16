pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-u root -v /home/ci/.m2:/root/.m2'
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