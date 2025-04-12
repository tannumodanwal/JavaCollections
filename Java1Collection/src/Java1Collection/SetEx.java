package Java1Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		
		
		Integer data[]= {12,1,2,6,4,3,5,3,6,};
		//LinkedHashSet<Integer> set  = new LinkedHashSet<Integer>();//
		TreeSet<Integer> set  = new TreeSet<Integer>();//for sorted
		//HashSet<Integer> set = new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(11);
		set.add(10);
		set.add(12);
		set.add(9);
		set.add(13);
		set.add(14);
		set.addAll(List.of(data));
		System.out.println(set);
		for(int nums:set) {
			System.out.print(nums+" ");
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
