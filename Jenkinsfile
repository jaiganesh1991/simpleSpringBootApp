pipeline {
    agent jenkns1_slave
    
    stages {
        stage('Checkout') {
            steps {
                
                checkout scm
            }

        }
        stage('Build') {
            steps {
                
                echo "Building the Book store jar"
                sh 'mvn -Dmaven.test.failure.ignore=true clean install'
                
            }

           
        }
        stage('Docker') {
            
            steps {
                sh 'docker ps -a'
            }

        }
        stage('End') {
            echo 'Build is now complete'
        }




    }

}
