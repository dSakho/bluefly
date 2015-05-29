package com.bluefly.codechallenge.ship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bluefly.codechallenge.crew.Crew;
import com.bluefly.codechallenge.crew.NonTallyKeeper;
import com.bluefly.codechallenge.crew.TallyKeeper;
import com.bluefly.codechallenge.log.Logger;
import com.bluefly.codechallenge.model.Pair;
import com.bluefly.codechallenge.model.Switch;
import com.bluefly.codechallenge.util.SwitchUtility;

public class Ship {
	
	private static int hourlyWait;
	private List<Crew> crew;
	
	public Ship(int waitTime, Pair<Switch, Switch> switchPair) {
		hourlyWait = waitTime;
		SwitchUtility.setSwitches(switchPair);
		
		crew = new ArrayList<>();
	}
	
	public static int getTimeInterval() {
		return hourlyWait * 1000;
	}
	
	public void initializeCrew() {
		Logger.log("Setting up the crew.");
		
		while(crew.size() != 22) {
			// Add NonTally Keepers
			crew.add(new NonTallyKeeper());
		}
		
		// Add Tally Keeper
		crew.add(new TallyKeeper());
		
		// Mix them up
		Collections.shuffle(crew);
	}
	
	public void runGame() {
		if (crew == null || crew.isEmpty()) {
			initializeCrew();
		}
		
		for (Crew crewMember : crew) {
			
			Logger.log(crewMember.getClass().getSimpleName()
					+ " selected to the switch room.");
			
			if (crewMember instanceof TallyKeeper) {
				if (((TallyKeeper) crewMember).isGameOver()) {
					Logger.log("Everybody has gone, set us free!");
					break;
				} else {
					crewMember.doAction();
				}
			} else {
				crewMember.doAction();
			}
			
			Logger.log("Tally Keeper Count: " + TallyKeeper.personalCount + 
					" | NonTally Keeper Count: " + NonTallyKeeper.personalCount);
		}
	}
}
