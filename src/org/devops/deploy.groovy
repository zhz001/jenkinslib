package org.devops

def saltDeploy(host.fun){
    sh "salt \"${hosts}\" ${func}"
}
