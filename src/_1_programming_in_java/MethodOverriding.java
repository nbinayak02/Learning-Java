package _1_programming_in_java;

import java.util.Scanner;

class Person {
	
	String name, address, gender;
	
	protected void getData() {
		
		System.out.println("Enter name, address and gender of a person: ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		address = sc.nextLine();
		gender = sc.nextLine();
//		sc.close(); //closing scanner here closes all input stream for entire program so child class method cannot access scanner object
	}
	
	protected void showData() {
		System.out.println("Name\tGender\tAddress");
		System.out.println(name+"\t"+gender+"\t"+address);
	}
	
}

class Students extends Person {
	
	String faculty;
	int roll;
	
	public void getData() {
		
		super.getData(); //accessing super class method
		
		System.out.println("Enter faculty and roll number of Student: ");
		Scanner sc2 = new Scanner(System.in);
		faculty = sc2.nextLine();
		roll = sc2.nextInt();
		sc2.close();
	}
	
	public void showData() {
		
		super.showData();
		
		System.out.println("Faculty: "+faculty+" Roll Number: "+roll);
	}
	
}

public class MethodOverriding {

	public static void main(String args[]) {
		
		Students s = new Students();
		s.getData();
		s.showData();
	}
	
}
