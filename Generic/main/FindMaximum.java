package com.lambdaexpression;

import java.util.Arrays;
import java.util.Optional;
public class FindMaximum<E extends Comparable<E> > {
	E[] array ;
   public  FindMaximum(E[] array ) {
	   this.array = array;
	   
   }
   public void findMax() {
	   findMax();
	   
   }
   
    public static <E extends Comparable<E> >  E findMax( E[] array) {	  
	   Arrays.sort(array) ;
	   E max = array[0];
	   if (array[1].compareTo(max) > 0) {
		   max = array[1];
	   }
	   if (array[2].compareTo(max) > 0) {
		   max = array[2];
	   }	
	   if (array[3].compareTo(max) > 0) {
		   max = array[3];
	   }
	   if (array[4].compareTo(max) > 0) {
		   max = array[4];
	   }
	   return max;
   }
   public static <E> E printMax(E max) {
		System.out.println("Maximum Value is:" + max) ;
		return max;
   }
}
