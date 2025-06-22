package _1_programming_in_java;

class Student {
	
	String name;
	int roll;
	static int count = 0;
	
	Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
		count++;
	}
	
	public void getStudent() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}
	
	public static void showCount() {
		System.out.println("Number of Student: "+count);
	}
	
}

public class StaticMembersAndMethods {

	public static void main(String[] args) {

		Student.showCount();
		
		Student s1 = new Student("Binayak", 1);
		Student.showCount();
		s1.getStudent();
		Student s2 = new Student("Dipesh", 2);
		Student.showCount();
		s2.getStudent();
		Student s3 = new Student("Deep", 3);
		Student.showCount();
		s3.getStudent();
	}
	
}
