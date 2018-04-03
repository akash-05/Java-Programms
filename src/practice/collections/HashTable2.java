package practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "delhi");
		map.put(2, "bangalore");
		map.put(3, "chennai");
		map.put(4, "lukcnow");
		map.put(5, "kolkata");
		map.put(6, "Pune");
		map.put(7, "Mumbai");
		map.put(8, "patna");
		map.put(9, "Bhopal");
		map.put(null, null);
		System.out.println(map);
		HashTable2 ht = new HashTable2();
		ht.traverseEntries(map);
	}

	// traversing map entry using for loop
	public void traverseEntries(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> me : map.entrySet()) {
			System.out.println(me.getKey() + " = " + me.getValue());
		}

	}
}
