package com.bluefly.codechallenge.model;

public class Switch {

	private final String switchName;
	private SwitchState switchState = null;
	
	public Switch(String switchName, SwitchState switchState) { 
		this.switchName = switchName;
		this.switchState = switchState;
	}
	
	public String getSwitchName() {
		return switchName;
	}
	
	public SwitchState getSwitchState() {
		return switchState;
	}
	
	public void setSwitchState(SwitchState switchtate) {
		this.switchState = switchtate;
	}
	
	public void flipTheSwitch() {
		if (switchState.toString().equals("UP")) {
			setSwitchState(SwitchState.DOWN);
		} else if (switchState.toString().equals("DOWN")) {
			setSwitchState(SwitchState.UP);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Switch Name: %s | Switch State: %s", 
				getSwitchName(), getSwitchState().toString());
	}
}