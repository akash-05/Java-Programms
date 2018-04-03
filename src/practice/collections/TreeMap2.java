package practice.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//program to find the recurrence of a number in array
public class TreeMap2 {

	public static void main(String[] args) {
		int a[] = { 4, 1, 2, 7, 8, 5, 3, 2, 1, 4, 5, 6, 7, 8 };// 11223445567788
		HashMap<Integer, Integer> hm = new HashMap<>();
		// Traverse through the given array
		for (int i = 0; i < a.length; i++) {
			Integer c = hm.get(a[i]);
			System.out.println("value of cc = "+c);
			// If this is first occurrence of element
			if (hm.get(a[i]) == null)
				hm.put(a[i], 1);

			// If elements already exists in hash map
			else
				hm.put(a[i], ++c);
		}
		for (Map.Entry m : hm.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());

	}
}
