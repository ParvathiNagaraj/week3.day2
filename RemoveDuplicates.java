package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {

		// Declare all variables

		String str = "We learn java basics as part of java sessions in java week1";
		String str2 = "";

		// Split the given sentence to get each word as String array
		String[] str1 = str.split(" ");

		// Convert String Array str1 to LinkedHashSet to remove duplicates
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(str1));

		// Convert to String
		for (String eachWord : set) {

			str2 = str2 + eachWord + " ";
		}

		// Display given String after removing duplicates
		System.out.println("The Sentence after removing duplicates = " + str2);
	}

}
