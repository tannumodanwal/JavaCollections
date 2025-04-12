package Java1Collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
	//	PriorityQueue<Integer> queue= new  PriorityQueue<Integer>(Comparator.reverseOrder());
	//	LinkedList<Integer> queue  = new LinkedList<Integer>();
		Queue<Integer> queue  = new LinkedList<Integer>();
		queue.offer(12);
		queue.offer(14);
		queue.offer(11);
		queue.offer(10);
		queue.offer(4);
		queue.offer(8);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		
		
		
		
	}

}
