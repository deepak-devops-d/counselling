pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                checkout scm
            }
        }

        stage('Build Frontend Image') {
            steps {
                sh 'cd frontend && docker build -t psychology-frontend .'
            }
        }

        stage('Build Backend Image') {
            steps {
                sh 'cd backend && docker build -t psychology-backend .'
            }
        }

        stage('Run Containers') {
            steps {
                sh '''
                    docker rm -f frontend || true
                    docker rm -f backend || true
                    docker run -d -p 3000:80 --name frontend psychology-frontend
                    docker run -d -p 5000:5000 --name backend psychology-backend
                '''
            }
        }
    }
}
