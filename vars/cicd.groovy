def newGit(repo)
{
    git "https://github.com/azmeeranaveen/${repo}.git"
}
def newmaven()
{   
    sh 'mvn package'
}
def newDeploy(jobname,ipaddress,context)
{
    sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapp/${context}.war"
}   
