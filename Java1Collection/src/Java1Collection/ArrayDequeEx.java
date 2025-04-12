package Java1Collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue  = new ArrayDeque<Integer>();
		queue.offer(14);
		queue.offerFirst(15);
		queue.offerLast(46);
		queue.offer(67);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        queue.poll();
        System.out.println(queue);
		
	}

}
