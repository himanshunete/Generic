package com.javapractiseuc4;


import org.junit.Test;
import org.junit.Assert;
public class FindMaximumTest {
   
	@Test
	public void givenThreeIntegerNumber_ShouldReturnMaximumValue() {
		Integer[] intNum = { 6, 2, 1, 11, 20 } ; 
		FindMaximum maxOperation = new FindMaximum();
		Integer maxInteger = maxOperation.findMax(intNum);
		maxOperation.printMax(maxInteger) ;
		Assert.assertEquals( Integer.valueOf(20),  maxInteger);
	}
	
	@Test
	public void givenThreeFloatNumber_ShouldReturnMaximumValue() {
		Double[] doubleNum = { 6.1, 2.8, 4.6, 1.1, 9.8 } ; 
		FindMaximum maxOperation = new FindMaximum();
		Double maxDouble = maxOperation.findMax(doubleNum);
		maxOperation.printMax(maxDouble) ;
		Assert.assertEquals( Double.valueOf(9.8),  maxDouble);
	}
	
	@Test
	public void givenThreeStrings_ShouldReturnMaximumString() {
		String[] string = { " apple", " water ", " orange " } ; 
		FindMaximum maxOperation = new FindMaximum();
		String maxString = maxOperation.findMax(string);
		maxOperation.printMax(maxString) ;
		Assert.assertEquals( " water ",  maxString);
	}
	
}
