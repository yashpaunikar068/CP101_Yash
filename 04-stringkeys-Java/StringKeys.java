/**
 * Write a HashTable class that stores strings
in a hash table, where keys are calculated
using the first two letters of the string.
 */

import java.util.*;

public class StringKeys {
	Hashtable<Integer, List<String>> table;
	public StringKeys() {
		// Your code goes here
		table = new Hashtable<>();
	}

	public void store(String key) {
		// Your code goes here
		if(table.get(calculate_hash_value(key)) != null)
			table.get(calculate_hash_value(key)).add(key);
	}

	public int lookup(String key) {
		// Your code goes here
		if(table.get(calculate_hash_value(key)) == null)
			return -1;
		else
			return 1;
	}

	public int calculate_hash_value(String key) {
		// Your code goes here
		return key.substring(0,2).hashCode();
	}

	public void show_bucket(String key) {
		// Your code goes here
		for(String x : table.get(calculate_hash_value(key)))
			System.out.print(x+" ");
	}
}