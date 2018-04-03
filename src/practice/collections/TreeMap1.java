package practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;;

public class TreeMap1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(12, "delhi");
		map.put(2, "bangalore");
		map.put(3, "chennai");
		map.put(4, "lukcnow");
		map.put(15, "kolkata");
		map.put(6, "Pune");
		map.put(7, "Mumbai");
		map.put(8, "patna");
		map.put(9, "Bhopal");
		System.out.println(map);
		TreeMap<Integer, String> ht = new TreeMap<Integer, String>(map);
		System.out.println(ht);
		ht.put(12, "delhi");
		ht.put(2, "bangalore");
		ht.put(3, "chennai");
		ht.put(4, "lukcnow");
		ht.put(5, "kolkata");
		ht.put(6, "Pune");
		ht.put(7, "Mumbai");
		ht.put(8, "patna");
		ht.put(9, "Bhopal");
		System.out.println(ht.get(12));
	}

}
