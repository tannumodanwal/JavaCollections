package Java1Collection;

import java.util.ArrayList;

public class CustomExample {

	public static void main(String[] args) {
		
		    ArrayList<Student> students = new ArrayList<Student>();
		    students.add(new Student("Ashish Kumar",1,"MCA"));
		    students.add(new Student("Brijesh Kumar",2,"MCA"));
		    students.add(new Student("Rajesh Kumar",3,"MCA"));
		    students.add(new Student("Tanvi",4,"MCA"));
		    
		    for(Student s:students) {
		    	System.out.println(s);
		    }

	}
}

	
	class Student{
		
		String name;
		int roll_no;
		String course;
		
		
		//construntor using 
		public Student(String name, int roll_no, String course) {
			super();
			this.name = name;
			this.roll_no = roll_no;
			this.course = course;
		}
		
		
		//getters/setters (n capsulations)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll_no() {
			return roll_no;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		
		//tostring
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", roll_no=" + roll_no + ", course=" + course + "]";
		}
		
		
		
		
		
		
		
	
}
