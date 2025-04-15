pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh './gradlew assemble'  // Build the project using Gradle
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh './gradlew test'  // Run the tests using Gradle
                }
            }
        }
    }

    post {
        success {
            echo 'Build and Test Successful!'
        }
        failure {
            echo 'Build or Test Failed!'
        }
    }
}
