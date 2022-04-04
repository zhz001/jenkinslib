package org.devops

def altDeploy(host.fun){
    sh "salt \"${hosts}\" ${func}"
}
