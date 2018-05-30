package org.centurylink.examples;

import java.util.Arrays;
import java.util.Comparator;

public class MyStringArraySorting {

	public static void main(String[] args) {
		String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
		Arrays.sort(strArr, new Comparator<String>() {
				
			public int compare(String o1,String o2) {
				return o1.compareTo(o2);
			}}	);
		for(String str:strArr) {
			System.out.println(str);
		}
	}

}
