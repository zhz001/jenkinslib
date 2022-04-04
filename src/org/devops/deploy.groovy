package org.devops

def SaltDeploy(hosts,func){
    sh "salt \"${hosts}\" ${func}"
}
