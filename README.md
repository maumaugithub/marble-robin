marble-robin
============

This folder contains the Mars Rover Exercise.

# MARS ROVER EXERCISE

DESCRIPTION:
A squad of robotic Mars rovers are to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the
rovers so that their on-board cameras can get a complete view of the
surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y
co-ordinates and a letter representing one of the four cardinal compass
points. The plateau is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the rover is in the bottom
left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The
possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90
degrees left or right respectively, without moving from its current spot.
'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

INPUT:
The first line of input is the upper-right coordinates of the plateau, the
lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have
been deployed. Each rover has two lines of input. The first line gives the
rover's position, and the second line is a series of instructions telling
the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces,
corresponding to the x and y co-ordinates and the rover's orientation.

Each rover will be finished sequentially, which means that the second rover
won't start to move until the first one has finished moving.


OUTPUT
The output for each rover should be its final co-ordinates and heading.

INPUT AND OUTPUT

Test Input:
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM

Expected Output:
1 3 N
5 1 E


---
IMPLEMENTATION 
==============

TECHNOLOGY:
- This Demo is coded in Java (JDK 1.7) and uses a maven build.

HOW TO RUN 

Click on the Project Run As> Maven Build...
Select or Create a configuration as follows:

    Goal: clean install -DskipTests
    Goal: package -DskipTests

Please note some of the tests fail and some methods are just stubs.

SPECIFICATION NOTES:
- Does the rover receive continuous and conflicting positioning requests? Do we need multiple or consecutive updating?
- Is there a requirement to enable the rover stop/start?
- Is there a requirement for continuous movement?
- Is there a backwards movement?
- Failure handling mechanisms and scenarios
- Is there only one navigator actor or multiple concurrent/competing navigators?

ASSUMPTIONS: 
- The rover will run sequentially, which means it will execute the movement request and stop. 
- The rover response is assumed to be (0,0,N), instructions not formatted exactly as described are not supported.
- If a rover is started in an invalid position then the command will not execute.
- If a rover is instructed to move from a valid position to an invalid position the command will not execute.
