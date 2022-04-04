package org.devops

def SaltDeploy(hosts,func){
    sh "salt \"${hosts}\" ${func}"
}

def AnsibleDeploy(hosts,func){
    sh "ansible ${func} ${hosts}"
}
