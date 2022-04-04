@Library('jenkinslib') _

def tools = new org.devops.tools()

String workspace = "/root/.jenkins/workspace/"

//Pipeline
pipeline {
    agent { node { label "master" //指定运行节点的标签或者名称
                    customWorkspace "${workspace}" //指定运行的工作目录（可选）
            }

    }

    options{
        timestamps() //日志会有时间
        skipDefaultCheckout() // 删除隐式checkout scm语句
        disableConcurrentBuilds() //禁止并行
        timeout(time:1,unit:'HOURS') //流水线超市设置1h
    }

    stages {
        //下载代码
        stage('GetCode') { //阶段名称
            steps { //步骤
                timeout(5){
                    script{ //填写运行代码
                        println('获取代码')
                         tools.PrintMes("this is my lib!","red")
                    }
                }
            }
        }

        //構建
        stage('bulid') { //阶段名称
            steps { //步骤
                timeout(5){
                    script{ //填写运行代码
                        println('应用打包')
                    }
                }
            }
        }


        //代码扫描
        stage('CodeScan') { //阶段名称
            steps { //步骤
                timeout(5){
                    script{ //填写运行代码
                        println('代码扫描')

                        tools.PrintMes("this is my lib!","green")
                    }
                }
            }
        }
    }

    //构建后操作
    post{
        always{
            script{
                println('always')
            }
        }

        success{
            script{
                currentBuild.description += "\n 构建成功！"
            }
        }

        failure{
            script{
                currentBuild.description += "\n 构建失败！"
            }
        }

        aborted{
            script{
                currentBuild.description += "\n 构建取消！"
            }
        }
    }
}
