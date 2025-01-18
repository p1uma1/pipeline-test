pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // Replace with your GitHub repository URL
                git branch: 'main', url: 'https://github.com/p1uma1/pipeline-test.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    echo 'Compiling C++ file...'
                    sh 'g++ -o main main.cpp'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    echo 'Running the compiled program...'
                    sh './main'
                }
            }
        }
    }
}
