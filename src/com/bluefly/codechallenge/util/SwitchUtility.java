package com.bluefly.codechallenge.util;

import com.bluefly.codechallenge.log.Logger;
import com.bluefly.codechallenge.model.Pair;
import com.bluefly.codechallenge.model.Switch;
import com.bluefly.codechallenge.model.SwitchState;

public class SwitchUtility {

	private static Pair<Switch, Switch> switchRoom;
	
	static {
		switchRoom = 
			new Pair<Switch, Switch>(
					new Switch("A", SwitchState.UP), 
					new Switch("B", SwitchState.UP));
	}
	public SwitchUtility() { }
	
	public static void setSwitches(Pair<Switch, Switch> switchPair) {
		switchRoom = switchPair;
	}
	
	public static Switch getLeftSwitch() {
		return switchRoom.getLeftValue();
	}
	
	public static void setLeftSwitchState(SwitchState switchState) {
		Logger.log("Switching left switch to " + switchState.toString() + " position.");
		switchRoom.getLeftValue().setSwitchState(switchState);
	}
	
	public static void setLeftSwitch(Switch leftSwitch) {
		switchRoom.setLeftValue(leftSwitch);
	}
	
	public static Switch getRightSwitch() {
		return switchRoom.getRightValue();
	}
	
	public static void setRightSwitch(Switch rightSwitch) {
		switchRoom.setRightValue(rightSwitch);
	}
	
	public static void setRightSwitchState(SwitchState switchState) {
		Logger.log("Switching right switch to " + switchState.toString() + " position.");
		switchRoom.getRightValue().setSwitchState(switchState);
	}
}