package com.troy.pattern.strategy.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * This class show how to sort primitive arrays, wrapper classes Object Arrays.
 * 
 * @author troyyang
 *
 */
public class JavaObjectSorting {

	public static void main(String[] args) {

		/**
		 * Note: if you want to print the detail of the array, do not use the
		 * toString() method directly, use the Arrays.toString instead.
		 **/

		// sort the primitive array like int array
		System.out.println(">>>>>> Integer Array Sorting Test <<<<<<");

		int[] intArray = { 5, 6, 1, 2, 10 };

		System.out.println("Before Sort Integer Array: "
				+ Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("After Sort Integer Array: "
				+ Arrays.toString(intArray));

		// sort String Array
		System.out.println("\n>>>>>> String Array Sorting Test <<<<<<");

		String[] strArray = { "A", "K", "H", "E" };

		System.out.println("Before Sort String Array: "
				+ Arrays.toString(strArray));
		Arrays.sort(strArray);
		System.out.println("After Sort String Array: "
				+ Arrays.toString(strArray));
		
		// sort List of objects of wrapper classes
		System.out.println("\n>>>>>> List Sorting Test <<<<<<");
		
		List<String> strList = new ArrayList<String>();
		strList.add("Z");
		strList.add("E");
		strList.add("K");
		strList.add("B");
		
		Collections.sort(strList);
		for (String str : strList) {
			System.out.print(" " + str);
		}
		
	}
}
