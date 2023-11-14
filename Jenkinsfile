pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the 'main' branch
                checkout([$class: 'GitSCM', branches: [[name: 'main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ShreyJoshi29/jenkins-project']]])
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
