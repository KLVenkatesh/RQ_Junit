package org.centurylink.examples;

import java.util.Arrays;

import org.junit.Test;

public class BinarySearchOnCharArray {
	
	@Test
	public void BinarySearchTest() {
		char[] chrArr = {'a','c','d','y','e','q','b'};
		BinarySearch(chrArr, 'q');
	}
	
	public void BinarySearch(char[] c,char s) {
		int index = Arrays.binarySearch(c, 0, c.length-1, s);
		System.out.println(index);
	}
}
