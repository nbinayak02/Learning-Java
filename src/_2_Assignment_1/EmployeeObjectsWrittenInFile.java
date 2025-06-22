package _2_Assignment_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private String Name;
	private int Age;
	private double Salary;
	
	public Employee(String Name, int Age, double Salary) {
		
		this.Name = Name;
		this.Age = Age;
		this.Salary = Salary;
		
	}
	
	public String toString() {
		
		return "Name = " + Name + "\nAge = "+ Age +"\nSalary = "+Salary;
		
	}
}

public class EmployeeObjectsWrittenInFile {

	public static void main(String args[]) {
		
		Employee e1 = new Employee("Binayak",23,100000.34);
		Employee e2 = new Employee("Satya", 40, 234243.30495);
		Employee e3 = new Employee("Suprey", 34, 234234545.23423);
		
		try {
			
			FileOutputStream fos = new FileOutputStream( new File("E:\\Eclipse IDE Work Space\\Files\\emp.doc"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//write object to file
			oos.writeObject(e1);
			oos.writeObject(e2);
			oos.writeObject(e3);
			
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(new File("E:\\Eclipse IDE Work Space\\Files\\emp.doc"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp1 = (Employee) ois.readObject();
			Employee em2 = (Employee) ois.readObject();
			
			System.out.println(emp1.toString());
			System.out.println(em2.toString());
			
			ois.close();
			fis.close();
			
			
			
		} catch (Exception e) {
			
			System.out.println("Exception: "+e);
			
		} 
		
	}
}
