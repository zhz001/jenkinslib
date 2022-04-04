package org.devops

def SaltDeploy(host.fun){
    sh "salt \"${hosts}\" ${func}"
}
