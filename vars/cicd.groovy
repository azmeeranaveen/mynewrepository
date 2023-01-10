def NewGit(repo)
{
  git "https://github.com/azmeeranaveen/$(repo)-1.git"
}
def Newmaven()
{
  sh 'package'
}
