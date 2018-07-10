package org.dl.berlinclock.minute.row;


public class Minute {
	
	private Integer minutes;
	private Row firstrow;
	private Row secondrow;
	

	public Minute() {
		super();
		firstrow = new MinuteFirstRow();
		secondrow = new MinuteSecondRow();
	}

	public Minute(Row firstrow, Row secondrow) {
		super();
		this.firstrow = firstrow;
		this.secondrow = secondrow;
	}

	public void setMinutes(String minutesStr) {
		this.minutes = Integer.valueOf(minutesStr);;
	}
	
	public String display() {
		StringBuilder minuteDisplay = new StringBuilder();
		minuteDisplay.append(firstrow.display(minutes));
		minuteDisplay.append(firstrow.newLine());
		minuteDisplay.append(secondrow.display(minutes));	
		return minuteDisplay.toString();
	}
}
