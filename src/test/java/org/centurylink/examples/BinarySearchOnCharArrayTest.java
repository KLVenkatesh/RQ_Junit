package org.centurylink.examples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchOnCharArrayTest {
	
	@Test
	public void BinarySearchTest() throws Exception {
		char[] chrArr = {'a','c','d','y','e','q','b'};
		char[] chrArr1 = {};
		try {
			assertTrue("passing the array of chars", BinarySearchOnCharArray.BinarySearch(chrArr, 'q'));
			assertTrue("passing empty array",BinarySearchOnCharArray.BinarySearch(chrArr1,'q'));
		}catch(Exception e) {
			System.out.println("Empty array");
		}
		
	}

}
