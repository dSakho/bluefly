package com.bluefly.codechallenge.crew;

import com.bluefly.codechallenge.log.Logger;
import com.bluefly.codechallenge.model.Switch;
import com.bluefly.codechallenge.model.SwitchState;
import com.bluefly.codechallenge.util.SwitchUtility;

public class TallyKeeper implements Crew {
	
	public static int personalCount = 0;

	public TallyKeeper() { }
	
	public boolean isGameOver() {
		return (personalCount == 44);
	}
	
	public static void incrementCount() {
		personalCount++;
	}

	@Override
	public void doAction() {
		Switch leftSwitch = SwitchUtility.getLeftSwitch();
		SwitchState leftSwitchState = leftSwitch.getSwitchState();
		
		if (leftSwitchState.equals(SwitchState.UP)) {
			Logger.log("Left Switch is Down. Flip and Increment.");
			// Switch the left switch
			// and increment count
			leftSwitch.flipTheSwitch();
			SwitchUtility.setLeftSwitch(leftSwitch);
			
			incrementCount();
		} else {
			Logger.log("Flipping the Right Switch");
			// switch the right switch
			Switch rightSwitch = SwitchUtility.getRightSwitch();
			rightSwitch.flipTheSwitch();
			SwitchUtility.setRightSwitch(rightSwitch);
		}
	}
}