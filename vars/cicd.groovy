def newGit(repo)
{
   git "https://github.com/azmeeranaveen/${repo}-1.git"
}
def newMaven()
{
   sh "mvn package"
}
def newDeploy(jobname,ipaddress,context)
{
   sh "scp /var/lib/jenkins/workspace/sharedLibrary1/webapp/target/webapp.war ubuntu@172.31.8.214:/var/lib/tomcat9/webapps/testapp.war"
}   

