/**
 * Global pipeline for start release.
 *
 * @author agarcia (agarcia@atsistemas.com)
 * @since 1.0
 */

/**
 * Pipeline definition
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
      stage('generate branch') {
          agent any
          steps {
              echo 'Hello, new Branch'
          }
      }
      stage('Setting version') {
          agent any
          steps {
              echo 'Hello, new Version'
          }
      }
      stage('push branch') {
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
