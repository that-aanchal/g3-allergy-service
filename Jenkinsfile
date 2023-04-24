pipeline{
      agent any
           stages{
           stage('Checkout'){
           steps{
                git branch: "main" , url:'https://github.com/that-aanchal/g3-allergy-service.git'
           }
           }
           stage('Build'){
           steps{
            sh 'chmod a+x mvnw'
            sh './mvnw clean package -DskipTests=true'
           }
          stage('test'){
           steps{
            sh 'mvn test'
          
           }
           post{
           always{
           archiveArtifacts 'target/*.jar'
           }
           }
           }
           stage(DockerBuild){
           steps{
           sh 'docker build -t thataanchaljoshi/allergy-repo:allergy-service-image .'
           }
           }
           
           }     
      
}