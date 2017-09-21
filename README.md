# Java_Exe
This repository will hold the codes from your completed exercises from Java using Java How to Program by deitel

# Getting Started
In order to begin working with this repository, you need to have the following

* JDK installed and running 

* Git Installed
  If you are using a linux based operating system(recommended), use 
  ~~~~
  sudo apt-get install git
  ~~~~
  
* A <a href="https://github.com">Github account</a>  

* Java How to Program, 10th Edition.pdf

#  Working with this repository

##  Beginning Work
The repository contains folders labeled with the name of each contributor
The folders are going to contain the code of the completed tasks for each user at the end of each week
Each contributor will create a sub folders labeled week1, week2... and store the conresponding tasks for each week.
In order to achieve this:

* First fork the Java_Exe repository from lehone-hp. You may use the tutorial http://help.github.com/fork-a-repo

* Clone	the	project	repository	from	your	fork so that you can start working on it.	Fire	up	Terminal, move to the directory where you want the projrct to be stored	and	enter	the	  command:		
  ~~~~
  git	clone	https://github.com/{yourusername}/Java_Exe.git
  ~~~~

* Now,	go	into	the	folder	just	created	and	set	up	the	"upstream"	remote	so	you	can	eventually	pull	changes	from	the main	repository. 
  ~~~~
  git	remote	add	upstream	https://github.com/lehone-hp/Java_Exe.git
  ~~~~

##  Use git to manage your work
* In order to contribute, we are each going to work with the master branch of our fork. So enter the command:
  ~~~~
  git status
  ~~~~
  to check if your on the master branch which you are suppose to be in.

  Now you may start working on your task in the master branch.
  
* To identify which files you have changed use:
  ~~~~
  git status
  ~~~~
  
##  Stage and Commit your changes
* As	you	work	on	your	code,	you	may	want	to	periodically	stage	and	commit	your	changes	into	your	branch.	To	stage	all changed	and	new	files	into	your	commit,	use	the	command:
	~~~~
  git	add	-A
  ~~~~
  Now	these	files	are	staged,	and	ready	to	be	committed.

* To commit	your	code	into	your	branch,	let's say for week 1, use	the	command:
  ~~~~
  git	commit  -m  "Week 1:	add a short description"
  ~~~~
  
##  Pushing your code and creating a pull request
After	multiple	iterations	of	making	changes	to	your	code	and	committing	them	into	your	branch,	push	your	code	into	your fork	by	running	the	following	commands.

* Update	your	branch	to	the	latest	code	using	the	following	command:
	~~~~
  git	pull	--rebase	upstream	master
  ~~~~

* Push your changes into your fork
  ~~~~
  git push
  ~~~~
  Running	this	command	will	prompt	you	to	authenticate	into	GitHub.	After	doing	so,	it	will	upload	the	changes	into	your	fork. You	may	now	visit	your	push	on	GitHub	at	a	URL	like
  
		http://github.com/{yourgithubname}/Java_Exe/
    
* Now create a pull request using the create pull request link on Github so that your code can be merged with the main repository; lehone-hp/Java_Exe
