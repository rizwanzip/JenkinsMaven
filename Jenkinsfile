//@Library('centapplib@development') _
// Jenkinsfile
@Library('first-shared-lib') _

pipeline {
    agent any
    tools{
        jdk 'JDK-17'
        gradle 'GRADLE_HOME'
    }

    stages {
        //stage('Git Checkout') {
        //    steps {
		//		echo "Checkout...."
        //       // git changelog: false, poll: false, url: 'https://github.com/rizwanzip/JenkinsGradle.git'
        //    }
        //}
        stage('Code Build') {
            steps {
                 echo "Code Build...."
				 utility 'Dave'
				// utility.info('test-Call')
               // bat  'gradlew clean build test'
            }            
        }
         stage('Test Build') {
            steps {
                echo "Build Test...."
                // bat  'gradlew test'
            }
        }
        stage('Docker Build Image') {
            steps {
                echo "Docker Build...."
                //bat 'gradlew bootBuildImage --imageName=centegydocker/com.centegy.global --builder=paketobuildpacks/builder:tiny'
            }
			
        }
        stage('DockerHub Push Image') {
            steps {
               echo 'DockerHub Push Image'
            }
			
        }
    }
}
