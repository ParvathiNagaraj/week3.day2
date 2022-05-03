package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Finding duplicates in given array list using List and HashSet

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		// Declaring ArrayList
		List<Integer> list = new ArrayList<Integer>();

		// adding all numbers to list
		list.addAll(Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));

		// sorting number in ascending order
		Collections.sort(list);

		// printing the list
		System.out.println("The input List = " + list);

		// getting size of the list
		int size = list.size();

		// Declaring HashSet to check for duplicate
		Set<Integer> set = new HashSet<Integer>();

		// Iterating through each numbers
		for (int i = 0; i < size; i++) {

			// currently set has no value.checking list values is available in Set
			if (set.contains(list.get(i))) {

				// if available it will take it as Duplicate

				System.out.println("The Duplicated Numbers are " + list.get(i));
			}

			// if list values not available in Set then those values will be added to set.

			else {
				set.add(list.get(i));
			}

		}

	}
}
