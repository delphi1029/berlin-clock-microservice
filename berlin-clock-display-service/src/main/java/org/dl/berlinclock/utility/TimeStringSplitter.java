package org.dl.berlinclock.utility;


public class TimeStringSplitter {
	
	private static final String TIME_DELIMITER = ":";

	
	public String[] splitTimeString(String aTime) {
		return aTime.split(TIME_DELIMITER);
	}
}