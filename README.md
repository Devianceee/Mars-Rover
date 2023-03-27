# ITV Mars Rover - Brief

The next Mars Rover is being developed, and we need you to come up with a simple way of
issuing navigation instructions to it from back on Earth!


## Instructions
We would like you to model the following.
### Part 1: Basic Movement
1. The Mars Rover operates on a grid of arbitrary size.
2. You can only issue three commands: Move forward, rotate clockwise, and rotate
   anticlockwise.
3. If the rover moves off the grid, it reappears on the opposite side of the grid.

### Part 2: Autopilot
1. Devise a simple process for determining the shortest possible path from one position
   on the grid to another.
2. Improve the solution so that it can avoid mountain ranges that occupy a number of
   inconvenient grid squares scattered around the map.

### Part 3: Putting it all together
   Output all the instructions and moves carried out by the rover to get from one grid square to
   another. The output can take any form e.g rows of text, JSON data, or something graphical. 

## How to run
Go to the root of the folder and type ```sbt run``` in the terminal to run the project

## Thoughts

Assumption is that: I give the rover instructions one by one, after it's done it would tell me it's position

My first thoughts is that I need to setup the relevant case classes needed for the rover to exist, 
such as the grid and all the information needed for the rover to move. 

Next thing to do is setup the logic where I can give it commands to move forward and it tracks this (I assume the rover starts at (0, 0) but this can be changed). 
After this the next thing to do is to get it rotate properly. This would be the foundation.

#### HAVEN'T DONE BELOW BUT WANT TO DO

After this, the final thing is to have a check to see if it would go past the boundaries of the grid, 
and if it does then it "teleports" to the opposite side. Not sure on the maths on this so I'll have to figure this out.