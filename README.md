<h1>Multi-agent System</h1>
<p>This is the project of multi-agent system that is finished by two students within one month for solving the problem of FAPP.</p>
<p>The outils that we used are Java + <a href="http://jacamo.sourceforge.net/">Jacamo</a>.</p>
<p>This is the details about the problem of FAPP: <a href="http://www7.inra.fr/mia/T/schiex/Doc/CELAR.shtml">FAPP description.</a></p>
<br/>

<h3>Requirements:</h3>
<p>We want to develop a multiagent simulator to solve frequency assignment problems (FAPP). The idea is to model antennas as agents that 
have to cooperate to find the optimal frequency assignment. When an antenna chooses its frequency, it may interfer with other antennas 
due to radio frequency properties. Therefore, neighboring antennas share constraints on their values: they must keep some distance between
their values. Another requirement to take into account is that we want to minimize the number of used frequencies, to keep some space for 
future deployement of antennas. We propose to map the FAPP as a distributed constraint optimisation problem [5, 3]. This DCOP should solve
using the DPOP algorithm we have studied during the class. The multiagent system can be developed with any programming language (Java, 
Python, JaCaMo, Jason, . . . ). The precise version of the FAPP you choose is up to you, but your program needs to be compliant with the 
format presented in.</p>
<br/>

<h3>Descriptions:</h3>
<h6>The project consists of two parts:</h6>
<p>--<a href="https://github.com/yishuo/MultiAgent_System/tree/master/DFS">DFS</a>: This is a java project 
for reading the data from the files .txt and then processing the data to get the DFS tree (the relation of children, pseudo-children, parent, 
pseudo-parent.).</p>
<p>--<a href="https://github.com/yishuo/MultiAgent_System/tree/master/projet_jacamo_FAPP">Jacamo</a>: This is 
a jacamo project for getting the Ooptimal frequency allocation scheme via the DFS tree obtained in the java project.</p>
<br/>

<h6>Other documents:</h6>
<p>This is the descriptions of the project: <a href="https://github.com/yishuo/MultiAgent_System/blob/master/MAS-project-2015.pdf">Project Descriptions</a>.</p>
<p>This is the user's manual: <a href="https://github.com/yishuo/MultiAgent_System/blob/master/User%E2%80%98s%20manual.pdf">User's manual</a>.</p>
<p>This is the diapositives presented in the examination of the project: <a href="https://github.com/yishuo/MultiAgent_System/blob/master/PPT.pdf">PPT</a>.</p>
<p>This is the report of the project: <a href="https://github.com/yishuo/MultiAgent_System/blob/master/Report.pdf">Report</a></p>
