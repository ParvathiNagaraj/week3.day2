package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); // declaring arraylist
		List<String> list1 = new ArrayList<String>();

		// adding values to the list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("G");
		list.add("F");
		list.add("C");

		System.out.println(list);

		// checking size of the list
		int size = list.size();

		// iterating each size
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				String str = list.get(i); // storing value in string
				String str1 = list.get(j);

				if (str == str1) { // checking both string is same

					list1.add(str1);

				}
			}
		}

		System.out.println("The Duplicate values in list are " + list1);

	}

}
