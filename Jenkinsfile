pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the 'main' branch
                checkout(branch: 'main')
            }
        }

        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Add deployment steps here if needed
            }
        }
    }
}
