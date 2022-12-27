def newGit(repo)
{
    git "https://github.com/azmeeranaveen/${repo}.git"
}
def newmaven()
{   
    sh "mvn package"
}
