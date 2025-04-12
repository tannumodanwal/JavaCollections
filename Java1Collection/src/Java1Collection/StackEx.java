package Java1Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
	
		Stack<String> s = new Stack<String>();
		s.push("Tannu");
		s.push("Sakshi");
		s.push("Ashish");
		s.push("Adarsh");
		s.push("Tanu");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println("Deletion Value:"+s.pop());
		System.out.println(s);
		
	}

}
