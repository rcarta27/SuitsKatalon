pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh '''
                ./katalonc  -projectPath="SuitsKatalon/SuitsKatalon.prj" -browserType="Chrome" -retry=0 -testSuitePath="Test Suites/Test Suite1" -browserType="Chrome" -executionProfile="default" -apiKey="3a49462b-9ba8-42b2-8dbe-57a293463e5e" --config -webui.autoUpdateDrivers=true
                '''

            }

        }

    }

}
