package com.javapractise;

public class FindMaximum {
    Integer findMax(Integer firstPositionInteger, Integer secondPositionInteger, Integer thirdPositionInteger ) {
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
