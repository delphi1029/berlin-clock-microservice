package org.dl.berlinclock.hour.row;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestHourSecondRow {
	
	HourRow hourSecondRow;
	
	@Before
	public void init() {
		hourSecondRow = new HourSecondRow();
	}
	
	
	@Test
	public void testDisplayMidnight() {
		String expected = "OOOO";
		
		StringBuilder actual = hourSecondRow.display(00);
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayMidAfternoon() {
		String expected = "RRRO";
		
		StringBuilder actual = hourSecondRow.display(13);
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayJustBeforeMidnight() {
		String expected = "RRRO";
		
		StringBuilder actual = hourSecondRow.display(23);
		
		Assert.assertEquals(expected, actual.toString());
	}
	
	@Test
	public void testDisplayOnMidnight() {
		String expected = "RRRR";
		
		StringBuilder actual = hourSecondRow.display(24);
		
		Assert.assertEquals(expected, actual.toString());
	}


}
