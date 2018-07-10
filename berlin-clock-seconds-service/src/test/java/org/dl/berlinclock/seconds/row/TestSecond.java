package org.dl.berlinclock.seconds.row;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSecond {
	
	Seconds second;
	
	@Before
	public void init() {
		second = new Seconds();
	}
	
	@Test
	public void testDisplaySecondsLightOn() {
		second.setSecond("32");
		String expected = "Y\n";
		
		String actual = second.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplaySecondsLightOff() {
		second.setSecond("07");
		String expected = "O\n";
		
		String actual = second.display();
		
		Assert.assertEquals(expected, actual.toString());
	}
	

}
