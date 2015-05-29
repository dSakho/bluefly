package com.bluefly.codechallenge.test;

import com.bluefly.codechallenge.log.Logger;
import com.bluefly.codechallenge.model.Pair;
import com.bluefly.codechallenge.model.Switch;
import com.bluefly.codechallenge.model.SwitchState;
import com.bluefly.codechallenge.ship.Ship;

public class Test {

	public static final int hourlyTime = 2; // 2 hours
	
	public static void main(String[] args) {
		
		// Both switches are up
		Logger.log("**********************New Run.************************\n");
		Switch leftSwitchA = new Switch("A", SwitchState.DOWN);
		Switch rightSwitchA = new Switch("B", SwitchState.DOWN);
		Pair<Switch, Switch> switchRoom = new Pair<>(leftSwitchA, rightSwitchA);
		Ship prisonShip = new Ship(hourlyTime, switchRoom);
		prisonShip.runGame();
		
		// Left Switch Up, right Switch Down
		Logger.log("**********************New Run.************************\n");
		Switch leftSwitchB = new Switch("A", SwitchState.UP);
		Switch rightSwitchB = new Switch("B", SwitchState.DOWN);
		switchRoom = new Pair<>(leftSwitchB, rightSwitchB);
		prisonShip = new Ship(hourlyTime, switchRoom);
		prisonShip.runGame();
		
		// Left switch down, right switch up
		Logger.log("**********************New Run.************************\n");
		Switch leftSwitchC = new Switch("A", SwitchState.DOWN);
		Switch rightSwitchC = new Switch("B", SwitchState.UP);
		switchRoom = new Pair<>(leftSwitchC, rightSwitchC);
		prisonShip = new Ship(hourlyTime, switchRoom);
		prisonShip.runGame();
		
		// Both switches down
		Logger.log("**********************New Run.************************\n");
		Switch leftSwitchD = new Switch("A", SwitchState.DOWN);
		Switch rightSwitchD = new Switch("B", SwitchState.DOWN);
		switchRoom = new Pair<>(leftSwitchD, rightSwitchD);
		prisonShip = new Ship(hourlyTime, switchRoom);
		prisonShip.runGame();
	}
}