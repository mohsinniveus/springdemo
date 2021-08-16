pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            //git clone --branch main 'https://github.com/mohsinniveus/springdemo.git'
            
            git(
       			url: 'https://github.com/mohsinniveus/springdemo.git',
       			credentialsId: 'github',
       			branch: "main"
    		)

            // Ru{n Maven on a Unix agent.
            sh "./mvnw -Dmaven.test.failure.ignore=true clean package"

            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
          }
      }
      stage('test') {
          
          steps {
              sh "./mvnw test"
          }
      }

    }
 }