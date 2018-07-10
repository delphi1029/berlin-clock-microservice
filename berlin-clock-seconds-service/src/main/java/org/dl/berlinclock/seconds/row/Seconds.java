package org.dl.berlinclock.seconds.row;


public class Seconds {

	private Integer second;
	private Row row;
	
	

	public Seconds() {
		super();
		this.row = new SecondsRow();
	}

	public Seconds(Row row) {
		super();
		this.row = row;
	}

	public void setSecond(String secondStr) {
		this.second = Integer.valueOf(secondStr);;
	}
	
	public String display() {
		StringBuilder secondsDisplay = new StringBuilder();
		secondsDisplay.append(row.display(second));
		secondsDisplay.append(row.newLine());
		return secondsDisplay.toString();
	}
}
