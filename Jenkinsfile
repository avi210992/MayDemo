pipeline {
    agent any
 parameters {
        string(name: 'ENVIRONMENT', defaultValue: 'dev', description: 'Target environment')
        string(name: 'TEST_SUITE', defaultValue: 'unit', description: 'Type of tests to run')
    }
    stages {
        stage('Checkout Code') {
            steps {
                checkout scm  // ✅ pulls code from the repo that triggered this build
            }
        }
        stage('Build') {
            steps {
                echo "Running tests for ${params.ENVIRONMENT} with suite ${params.TEST_SUITE}"
                bat "mvn clean test -Denv=${params.ENVIRONMENT} -Dsuite=${params.TEST_SUITE}"
            }
        }
    }
}
