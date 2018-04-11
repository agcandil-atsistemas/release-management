/**
 * Global pipeline for end release.
 *
 * @author agarcia (agarcia@atsistemas.com)
 * @since 1.0
 */

/**
 * Pipeline end Release call
 */
void call() {
  pipeline {
    agent none
    stages {
      stage('Clone Repository and checkout branch') {
          agent any
          steps {
              echo 'Hello, Repo'
          }
      }
      stage('load Metadata') {
          agent any
          steps {
              echo 'Hello, i need Metadata??'
          }
      }
     stage('Setting version') {
          agent any
          steps {
              echo 'Hello, new Version'
          }
      }
      stage('push branch and create pullrequest') {
          agent any
          steps {
              echo 'Hello, push changes in GIT'
          }
      }
      post{
        always{
          echo 'Hello, always'
        }
      }
    }
  }
}
