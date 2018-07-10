package org.dl.berlinclock.hour.row;


public class HourSecondRow extends HourRow {
	

	public int getNumberOfOnLights(Integer hour) {
		int redLightsToGlowinSecondRow = hour % 5;
		return redLightsToGlowinSecondRow;
	}
}
