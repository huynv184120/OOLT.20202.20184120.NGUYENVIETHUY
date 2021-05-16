# Bandits simulator lab01

## About this Multi-Armed Bandits problem:
1. Multi-Armed Bandits is a classical game where there exists an Agent with K different actions which can be activated by choice, one at a time. When an action is taken, the Agent interacts with the environment by that particular action. The environment then will produce a signal as the reward for the corresponding actions, this reward may follow a  random distribution.
2. The Agent repeats this process for T rounds, each round one action.
3. The goal is to maximize the total sum of the receiving rewards. 

## How to run simulator:
⚠️ Your computer is required to have jdk (jre + javac), without whom the simulator can not be executed. 

After assuring your requirements, run in your terminal: **bash run.sh**

For those who use window operating system, search keywords "compile java command line window" for more detail.

Another ultility you can use is [this online coding website](https://replit.com/), make sure to include *run.sh* file so that you can execute the program with **bash run.sh**

## How to complete:

finish: **Agent_method.java**

- given:
  - the total number of actions by *Construtor method*: **nAction**
  - the reward of the previous action taken: **pastReward**, this value is **0** when this function is called the first time
  - the id of the previous action taken: **pastActionId**, this value is **-1** when this function is called the first time
- the body of the class is yours to design, create table of values, create method to compute information returns...
- return the id of the action you choose

*Notice*: Consider both **exploration** and **exploitation** for the best performance

## After Simulation:

The program is coded to produce a trace file, namely **result.csv** where all the information during the simulation is printed.

Also, at the end of the simulation, you are expected to see your own *score* at the bottom of the terminal output.

🏁 For more competitive results and figures, you can submit file **Agent_method.java** upto [this website](http://202.191.57.62:8501/) where your codes will be tested with multiple scripts, your scores are ranked with others.

## General warning:

😏 feel free to create new classes to support your code

🚫 please, do not change the nature of the function **getAction**. Meaning, the inputs and outputs must be kept still
