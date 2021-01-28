package com.junitassertions;

import org.junit.Test;
import org.junit.Assert;
public class FindMaximumTest {
   

	//FirstPosition
	@Test
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
	
	//FirstPosition
	@Test
	public void givenThreeDoubleNumber_AtFirstPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		Double maxDouble = maxOperation.findMax(7.8, 5.9, 4.0);
		Assert.assertEquals( Double.valueOf(7.8) ,  maxDouble);
	}
	
	//SecondPosition	
	@Test
	public void givenThreeDoubleNumber_AtSecondPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		Double maxDouble = maxOperation.findMax(4.0, 7.8, 5.9);
		Assert.assertEquals( Double.valueOf(7.8) ,  maxDouble);
	}
	
	//ThirdPosition
	@Test
	public void givenThreeDoubleNumber_AtThirdPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		Double maxDouble = maxOperation.findMax(4.0, 5.9, 7.8);
		Assert.assertEquals( Double.valueOf(7.8) ,  maxDouble);
	}
	
	//FirstPosition
	@Test
	public void givenThreeString_AtFirstPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		String maxString = maxOperation.findMax("Peach", "Apple", "Banana");
		Assert.assertEquals( "Peach",  maxString);
	}
	
	//SecondPosition
	@Test
	public void givenThreeString_AtSecondPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		String maxString = maxOperation.findMax("Apple", "Peach", "Banana");
		Assert.assertEquals( "Peach",  maxString);
	}
	
	//ThirdPosition
	@Test
	public void givenThreeString_AtThirdPosition_ShouldReturnMaximumValue() {
		FindMaximum maxOperation = new FindMaximum();
		String maxString = maxOperation.findMax("Apple", "Banana", "Peach");
		Assert.assertEquals( "Peach",  maxString);
	}
	
	
	
}

