package org.centurylink.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArraysToListTest {
	@Test
	public void arrayListTest() throws Exception {
		String strArr[] = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
		String strArr1[] = {};
		String strArr2[] = null;
		assertFalse("passing the array with values", ArraysToList.arrayList(strArr));
		assertTrue("passing Empty array", ArraysToList.arrayList(strArr1));
		assertFalse("passing NULL array", ArraysToList.arrayList(strArr2));
	}

}
