pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh '''
                cd SuitsKatalon
                ./katalonc  -projectPath="SuitsKatalon/SuitsKatalon.prj" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TS_RegressionTest" -apiKey="<user API key>" -orgID=<Katalon_OrgID>
                '''

            }

        }

    }

}
