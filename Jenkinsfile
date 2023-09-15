@Library('jenkinsSharedlib@master') _

pipeline {
    agent any   
    stages {
        //stage('Git Checkout') {
        //    steps {
		//		echo "Checkout...."
        //       // git changelog: false, poll: false, url: 'https://github.com/rizwanzip/JenkinsGradle.git'
        //    }
        //}
        stage('Code Build') {
            steps {
                 echo "Code Build....123"
				 script{
				 common.info("Select Modules from groovy") 
				 }
               // bat  'gradlew clean build test'
            }            
        }
         stage('Test Build') {
            steps {
                echo "Build Test...."
                // bat  'gradlew test'
            }
        }
            
    }
}
