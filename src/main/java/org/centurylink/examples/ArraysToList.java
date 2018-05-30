package org.centurylink.examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArraysToList {
	
	@Test
	public void arrayListTest() {
		String strArr[] = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
		arrayList(strArr);
	}
	

	public void arrayList(String s[]) {
		
		List<String> strList = Arrays.asList(s);
		System.out.println(strList.size());
		System.out.println(strList);
	}

}
