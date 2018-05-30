package org.centurylink.examples;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	
	public static boolean arrayList(String s[]) {
		if(s!= null) {
			List<String> strList = Arrays.asList(s);
			System.out.println(strList.size());
			System.out.println(strList);
			return true;
		}
		
		return false;
	}

}
