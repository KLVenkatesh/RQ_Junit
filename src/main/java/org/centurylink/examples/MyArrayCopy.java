package org.centurylink.examples;

import java.util.Arrays;

public class MyArrayCopy {

	public static void main(String[] args) {
		int[] myArr = {2,4,2,4,5,6,3};
		System.out.println("Size of the array: "+myArr.length);
		int[] newArr = Arrays.copyOf(myArr, 10);
		System.out.println("Lenght of an array after copy :"+ newArr.length);
		
	}

}
