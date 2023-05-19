def newGit(repo)
{
   git "https://github.com/azmeeranaveen/${repo}-1.git"
}
def NewMaven()
{
   sh "mvn package"
}

