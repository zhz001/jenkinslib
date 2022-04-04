package org.devops

def SaltDeploy(hosts,fun){
    sh "salt \"${hosts}\" ${func}"
}
