package org.dl.berlinclock.minute.row;

import org.dl.berlinclock.minute.lamp.Lamp;

public abstract class MinuteRow implements Row {

	public StringBuilder display(Integer minutes) {
		int numberOfLightsToGlow = getNumberOfOnLights(minutes);
		StringBuilder minuteDisplay = new StringBuilder();
		minuteDisplay.append(displayOnLamps(numberOfLightsToGlow));
		minuteDisplay.append(displayOffLamps(getNumberOfOffLights(numberOfLightsToGlow)));
		return minuteDisplay;
	}
	
	
	@Override
	public StringBuilder displayOffLamps(int numberOfOffLights) {
		StringBuilder displayOffLamps = new StringBuilder();
		for(int j=0; j<numberOfOffLights; j++) {
			displayOffLamps.append(Lamp.OFF.getSign());
		}
		return displayOffLamps;
	}


}
