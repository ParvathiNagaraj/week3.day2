package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		int a = 0; // declaring dummy variable

		List<String> list = new ArrayList<String>(); // declaring arraylist

		// adding values to the list
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		list.add("4");
		list.add("5");
		list.add("1");
		list.add("6");

		System.out.println(list);

		// checking size of the list
		int size = list.size();

		// iterating each size
		for (int i = 0; i < size; i++) {

			// getting string of index
			String string = list.get(i);

			// checking with if condition if the value is 1
			if (string == "1") {

				a++; // incrementing the dummy variable
			}
		}

		System.out.println("The No.of.1 in the list is " + a); // printing No.of.1
	}

}
