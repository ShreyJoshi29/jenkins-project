pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Maven project
                echo 'Building the Maven project'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                echo 'Running tests'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy the application (replace with your actual deployment command)
                // For a simple Java application without a JAR file, this could be running your main class
                echo 'Deploying'
            }
        }
    }
}
