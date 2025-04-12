package Java1Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
	
		//HashMap<String,Integer> map = new HashMap<String,Integer>();
		//LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();//ordering
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();//sort krna
		map.put("one", 1);
		map.put("Three", 3);
		map.put("Eight", 8);
		map.put("four", 4);
		map.put("Two", 2);
		map.put("nine", 9);
		map.put("nine", 19);//replacing
		map.put("Nine", 9);//non effetive
		
		System.out.println(map);
		System.out.println(map.containsKey("Ten"));//key Find out 
		System.out.println(map.containsValue(3));//value find out
		
		
		for(String Key: map.keySet()) {
			System.out.print(Key+" ");
		}
		System.out.println();
		for(Integer value: map.values()) {
			System.out.print(value+" ");
		}
		
	

//		map.clear();
//		System.out.println(map);
//		

	}

}
