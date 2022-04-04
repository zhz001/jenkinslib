package org.devops

//构建类型
def Build(buildType,buildShell){
    def buildTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
    
  println("当前打印类型的为：${buildType}")
  buildHome = tool buildTools[buildType]
    if ("${buildType}" == "npm"){
        sh "export NODE_HOME=${npmHome} && export PATH=\$NODE_HOME/bin:\$PATH && ${npmHome}/bin/npm ${bulidShell}"
 
    }
  sh "${buildHome}/bin/${buildType} ${buildShell}"
}
