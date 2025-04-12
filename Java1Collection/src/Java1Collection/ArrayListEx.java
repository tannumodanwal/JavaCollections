package Java1Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		Integer data[] = {1,2,3,4,5,6};
       // ArrayList<Integer> list  = new ArrayList<Integer>();
		//LinkedList<Integer> list  = new LinkedList<Integer>();
		Vector<Integer> list  = new Vector<Integer>();
        list.add(13);
        list.add(12);
        list.add(14);
		list.addAll(Arrays.asList(data));
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
        	System.out.print(list.get(i)+" ");
        }
        for(Integer v:list) {
        	System.out.print(v+" ");
        }
         list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(4));
        System.out.println(list);
        System.out.println(list.contains(102));
        
        Iterator<Integer> it = list.iterator();
        
        System.out.println();
        while(it.hasNext()) {
        	System.out.println(it.next()+" ");
        }
        System.out.println(list);
        
        
	}

}
