pipeline {
    agent any

    stages {
        // Stage 1: Clone the repo from GitHub
        stage('Clone Repository') {
            steps {
                checkout scm
            }
        }

        // Stage 2: Build Frontend Docker Image
        stage('Build Frontend Image') {
            steps {
                sh 'cd frontend && docker build -t psychology-frontend .'
            }
        }

        // Stage 3: Build Backend Docker Image
        stage('Build Backend Image') {
            steps {
                sh 'cd backend && docker build -t psychology-backend .'
            }
        }

        // Stage 4: Run Containers
        stage('Run Docker Containers') {
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
