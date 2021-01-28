package com.junitassertions;

public class FindMaximum {
	public Integer findMax(Integer firstPositionInteger, Integer secondPositionInteger, Integer thirdPositionInteger ) {
        Integer max = firstPositionInteger ;
		   if (firstPositionInteger.compareTo(max) > 0) {
			   max = firstPositionInteger;
		   }
		   if (secondPositionInteger.compareTo(max) > 0) {
			   max = secondPositionInteger;
		   }
		   if (thirdPositionInteger.compareTo(max) > 0) {
			   max = thirdPositionInteger;
		   }	   
		   return max;
	   }   
	
	public Double findMax(Double firstPositionDouble, Double secondPositionDouble, Double thirdPositionDouble ) {
	       Double max = firstPositionDouble ;
		   if (firstPositionDouble.compareTo(max) > 0) {
		      max = firstPositionDouble;
		   }
		   if (secondPositionDouble.compareTo(max) > 0) {
		      max = secondPositionDouble;
		   }
		   if (thirdPositionDouble.compareTo(max) > 0) {
		      max = thirdPositionDouble;
		   }	   
		   return max;
		}  
	
	public String findMax(String firstPositionString, String secondPositionString, String thirdPositionString ) {
	       String max = firstPositionString ;
		   if (firstPositionString.compareTo(max) > 0) {
		      max = firstPositionString;
		   }
		   if (secondPositionString.compareTo(max) > 0) {
		      max = secondPositionString;
		   }
		   if (thirdPositionString.compareTo(max) > 0) {
		      max = thirdPositionString;
		   }	   
		   return max;
		}  
}



