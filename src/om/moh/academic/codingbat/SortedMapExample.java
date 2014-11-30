package om.moh.academic.codingbat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		
		System.out.println("Before Sorting......");
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("Mujeeb", "1");
		unsortMap.put("Zia", "2");
		unsortMap.put("Sara", "3");
		unsortMap.put("Biju", "4");
 
		printMap(unsortMap);
 
		System.out.println("\nAfter Sorting......");
		Map<String, String> treeMap = new TreeMap<String, String>(unsortMap);
		printMap(treeMap);
 
	}
 
	public static void printMap(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() 
                                      + " Value : " + entry.getValue());
		}
	}
}
