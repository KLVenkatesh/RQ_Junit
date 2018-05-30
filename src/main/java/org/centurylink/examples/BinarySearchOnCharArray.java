package org.centurylink.examples;

import java.util.Arrays;

public class BinarySearchOnCharArray {
	
	public static boolean BinarySearch(char[] c,char s) throws ArrayIndexOutOfBoundsException {
		if(c!=null) {
			int index = Arrays.binarySearch(c, 0, c.length-1, s);
			System.out.println(index);
			return true;
		}
		return false;
	}
}
