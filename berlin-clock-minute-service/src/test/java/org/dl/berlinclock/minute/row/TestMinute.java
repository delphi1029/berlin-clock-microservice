package org.dl.berlinclock.minute.row;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMinute {
	
	Minute minute;
	
	@Before
	public void init() {
		minute = new Minute();
	}
	
	@Test
	public void testDisplayMidnight() {
		minute.setMinutes("00");
		String expected = "OOOOOOOOOOO\nOOOO";
		
		String actual = minute.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	
	@Test
	public void testDisplayJustBeforeMidnight() {
		minute.setMinutes("59");
		String expected = "YYRYYRYYRYY\nYYYY";
		
		String actual = minute.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayMid() {
		minute.setMinutes("17");
		String expected = "YYROOOOOOOO\nYYOO";
		
		String actual = minute.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
}
