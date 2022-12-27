def newGit(repo)
{
    git "https://github.com/azmeeranaveen/${repo}.git"
}
def newMaven()
{   
    sh 'mvn package'
}
