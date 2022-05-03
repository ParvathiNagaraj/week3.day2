package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindInterSection {

	public static void main(String[] args) {

		// create first set
		Set<Integer> set = new HashSet<Integer>();

		// adding values to first set
		set.addAll(Arrays.asList(3, 2, 11, 4, 6, 7));

		// create second set
		HashSet<Integer> set1 = new HashSet<Integer>();

		// adding values to second set
		set1.addAll(Arrays.asList(1, 2, 8, 4, 9, 7));

		System.out.println("The First set of numbers are " + set);
		System.out.println("The First set of numbers are " + set1);

		// Finding intersection of two sets
		set.retainAll(set1);

		// Printing Intersection numbers
		System.out.println("The Intersection Numbers are " + set);

	}

}
