package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Declaring ArrayList
		List<Integer> list = new ArrayList<Integer>();

		// adding all numbers to list
		list.addAll(Arrays.asList(3, 2, 11, 4, 6, 7));

		// printing added numbers list
		System.out.println(list);

		// sorting number in ascending order
		Collections.sort(list);

		// reversing ascending order to get descending order
		Collections.reverse(list);

		// printing second largest number with help of index value
		System.out.println(list.get(1));
	}

}
