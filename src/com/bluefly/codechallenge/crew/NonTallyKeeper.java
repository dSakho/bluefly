package com.bluefly.codechallenge.crew;

import com.bluefly.codechallenge.log.Logger;
import com.bluefly.codechallenge.model.Switch;
import com.bluefly.codechallenge.model.SwitchState;
import com.bluefly.codechallenge.util.SwitchUtility;

public class NonTallyKeeper implements Crew {
	
	public static int personalCount = 0;

	public NonTallyKeeper() { }
	
	public static void incrementCount() {
		personalCount++;
	}
	
	@Override
	public void doAction() {
		if ((personalCount == 0) || 
				(personalCount == 1)) {
			Switch leftSwitch = 
					SwitchUtility.getLeftSwitch();
			
			if (leftSwitch.getSwitchState().equals(SwitchState.DOWN)) {
				Logger.log("Left Switch is Down. Flip and increment count.");
				
				leftSwitch.flipTheSwitch();
				SwitchUtility.setLeftSwitch(leftSwitch);
				
				incrementCount();
			}
		} else if (personalCount >= 2){
			// Switch the right switch
			Logger.log("Flipping Right Switch.");
			Switch rightSwitch = SwitchUtility.getRightSwitch();
			rightSwitch.flipTheSwitch();
			SwitchUtility.setRightSwitch(rightSwitch);
		}
	}
}