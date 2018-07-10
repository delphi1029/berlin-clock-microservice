package org.dl.berlinclock.hour.row;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestHour {
	
	Hour hour;
	
	@Before
	public void init() {
		hour = new Hour();
	}
	
	
	@Test
	public void testDisplayMidnight() {
		hour.setHour("00");
		String expected = "OOOO\nOOOO\n";
		
		String actual = hour.display();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDisplayMidAfternoon() {
		hour.setHour("13");
		String expected = "RROO\nRRRO\n";
		
		String actual = hour.display();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDisplayJustBeforeMidnight() {
		hour.setHour("23");
		
		String expected = "RRRR\nRRRO\n";
		
		String actual = hour.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayOnMidnight() {
		hour.setHour("24");
		
		String expected = "RRRR\nRRRR\n";
		
		String actual = hour.display();
		
		Assert.assertEquals(expected, actual.toString());
	}

}
