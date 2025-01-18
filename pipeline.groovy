pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                script {
                    echo 'Compiling C++ file...'
                    bat 'g++ -o main main.cpp'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    echo 'Running the compiled program...'
                    bat 'main.exe'
                }
            }
        }
    }
}
