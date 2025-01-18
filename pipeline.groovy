pipeline {
    agent any

    stages {

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
