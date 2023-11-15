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
                // Deploy the application (replace with your actual deployment command)
                // For a simple Java application without a JAR file, this could be running your main class
                sh 'java -cp src/main/java com.example.HelloWorld'
            }
        }
    }
}
}
