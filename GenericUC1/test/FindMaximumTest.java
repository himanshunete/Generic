package com.samples ;

import org.junit.Test ;
import org.junit.Assert ;

public class FindMaximumTest {
	
	public void givenThreeIntegerNumber_AtFirstPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		Integer maxInteger = maxOperation.findMax(7, 3, 5);
		Assert.assertEquals( Integer.valueOf(7),  maxInteger);
	}
	
	//SecondPosition
	@Test
	public void givenThreeIntegerNumber_AtSecondPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		Integer maxInteger = maxOperation.findMax(3, 7, 5);
		Assert.assertEquals( Integer.valueOf(7),  maxInteger);
	}
	
	//ThirdPosition
	@Test
	public void givenThreeIntegerNumber_AtThirdPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		Integer maxInteger = maxOperation.findMax(3, 5, 7);
		Assert.assertEquals( Integer.valueOf(7),  maxInteger);
	}
	
	@Test
	public void givenThreeString_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		String maxString = maxOperation.findMax("Bike", "King", "Yo");
		Assert.assertEquals( "Yo",  maxString);
	}
	
}

