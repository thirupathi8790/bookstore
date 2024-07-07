pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        sh 'npm install'
        sh 'npm run build'
      }
    }
    stage('Test') {
      steps {
        sh 'npm run test'
      }
    }
    stage('Deploy') {
      steps {
        sh 'aws ecs deploy --cluster demo-cluster --service book-store-service --task-definition book-store-task-def'
      }
    }
  }
}
