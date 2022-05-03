package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementinAnArray {

	public static void main(String[] args) {

		// Declaring ArrayList
		List<Integer> list = new ArrayList<Integer>();

		// adding all numbers to list
		list.addAll(Arrays.asList(1, 2, 3, 4, 7, 6, 8));

		// sorting number in ascending order
		Collections.sort(list);

		System.out.println("The input List are " + list);

		// getting size of the list
		int size = list.size();

		// declaring variables to get values from list
		int a = list.get(0);
		int b = list.get(size - 1);

		// Iterating each value
		for (int i = a + 1; i < b; i++) {

			// If i value not available in list prints below statement
			if (!list.contains(i)) {

				System.out.println("The Missing Element is " + i);

			}
		}

	}
}
