# bluefly
pirates!

Problem
Pirates have captured a ship and has decided to play a little game with the crew for their freedom. All 23
members of the crew are taken to a prison and will be kept in isolated cells so there will be no
communication between them. Every X (random) hours a pirate warden will take a random crew
member Y to a switch room. In the switch room are two switches labeled “A” and “B” that can be either
‘up’ or ‘down.’ The switches are not connected to anything and the crew does not know what the current
positions are. When the crew member is in the switch room, he must select one, and only one, of the
switches and reverse it’s position. After he has done that, he will be led back to his cell and no one else
will visit the switch room until the warden selects the next crew member.


If a crew member correctly tells the pirate warden that all crew members have visited the switch room
at least once, all crew members will be set free. If they are incorrect, all of the crew will be fed to the
alligators.


The ship’s crew has one chance to devise a strategy to win this game before they are taken to the
isolated cells.

Algorithm

Appoint one crew to be special; call her the ‘tallykeeper’. Then each crew should have the following behavior:

Nontallykeeper
First, the crew needs to keep a ‘personal count’. The count should start at zero. When they are called to
the switch room, their action will depend on their count and the position of the switches. If their count is
zero or one and the left switch is down, then they should switch the left switch and increment their
count. In all other cases, they should switch the right switch. They should never announce that they think
all crew have visited the switch room.

Tallykeeper
The tallykeeper
should also keep a ‘personal count’. This count should also start at zero. When the
tallykeeper
is called to the switch room, they should do the following. If the left switch is up, they should
switch it and increment their count. Otherwise, they should switch the right switch. If (actually, when)
their count reaches 44, they should announce to the warden that they think everyone has visited the
switch room.
The Exercise
Please design the classes and code to implement this algorithm. Include any unit tests you have.
