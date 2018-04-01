package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		int n = 0;
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
		Set<Map.Entry<Integer, String>> mapEntry = map.entrySet();
		Iterator<Entry<Integer, String>> it = mapEntry.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,String> me = it.next();
			System.out.println("Key = " + me.getKey() + " and value = " + me.getValue());
			if (me.getKey() == null) {
				continue;
			} else {
				n = n + (int) me.getKey();

			}
		}
		System.out.println(n);
	}

}
