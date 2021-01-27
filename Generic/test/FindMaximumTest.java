package com.lambdaexpression;

import org.junit.Test;
import org.junit.Assert;
public class FindMaximumTest {
   
	@Test
	public void givenThreeIntegerNumber_ShouldReturnMaximumValue() {
		Integer[] intNum = {1, 2, 6, 5, 3};
		FindMaximum maxOperation = new FindMaximum(intNum);
		Integer maxInteger = maxOperation.findMax(intNum);
		FindMaximum.printMax(maxInteger);
		Assert.assertEquals( Integer.valueOf(6),  maxInteger);
	}
	
	@Test
	public void givenThreeFloatNumber_ShouldReturnMaximumValue() {
		Double[] doubleNum = {1.2, 5.8, 3.5, 9.8, 2.4};
		FindMaximum maxOperation = new FindMaximum(doubleNum);
		Double maxDouble = maxOperation.findMax(doubleNum);
		FindMaximum.printMax(maxDouble);
		Assert.assertEquals( Double.valueOf(9.8),  maxDouble);
	}
	
	@Test
	public void givenThreeStrings_ShouldReturnMaximumString() {
		String[] string = {"Apple", "Peach", "Banana", "Orange", "WaterMelon"};
		FindMaximum maxOperation = new FindMaximum(string);
		String maxString = maxOperation.findMax(string);
		FindMaximum.printMax(maxString);
		Assert.assertEquals( "WaterMelon",  maxString);
	}
	
}
