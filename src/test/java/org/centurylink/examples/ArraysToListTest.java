package org.centurylink.examples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArraysToListTest {
	@Test
	public void arrayListTest() throws Exception {
		String strArr[] = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
		String strArr1[] = {};
		assertTrue("passing the array with values", ArraysToList.arrayList(strArr));
		assertTrue("passing Empty array", ArraysToList.arrayList(strArr1));
	}

}
