job('Eval_v1') {
    description 'v1'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/sylvainv92/DevOps-Eval-PHP-Docker.git')
                }
                branch('v1')
            }
        }

    triggers{
        scm('H/10 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('sylapero/devops-eval')
            registryCredentials('3f9a9835-98a1-4675-93f5-67350f95c3b5')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()
        }
    }
}

job('Eval_v1') {
    description 'v2'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/sylvainv92/DevOps-Eval-PHP-Docker.git')
                }
                branch('v2')
            }
        }

    triggers{
        scm('H/10 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('sylapero/devops-eval')
            registryCredentials('3f9a9835-98a1-4675-93f5-67350f95c3b5')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }

}

job('Eval_v3') {
    description 'v3'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/sylvainv92/DevOps-Eval-PHP-Docker.git')
                }
                branch('v3')
            }
        }

    triggers{
        scm('H/10 * * * *')
    }  
    steps {
        dockerBuildAndPublish {
            repositoryName('sylapero/devops-eval')
            registryCredentials('3f9a9835-98a1-4675-93f5-67350f95c3b5')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}
