pipeline{
  agent any
  stages {
   stage ('checkout') {
    steps { git "https://github.com/kvpkvp/bookstore-app.git'}
}
   stage('Build backend') {
    steps {
     dir('backend') {
      sh 'mvn clean package -DskipTests'
}
}
}
    stage('build docker images')  {
     steps {
       sh ...

        docker build -t bookstore-backend:latest ./backend
        docker build -t bookstore-backend:latest ./frontend
        ...
}
 }
    stage('Deploy compose)  {
      steps {
        sh 'docker compose up -d --build'
}
}
}
}
