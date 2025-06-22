package ExceptionHandlingInJava;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

class Voting {
	int age;
	
	Voting(int age){
		
		this.age = age;
	}
	
	public void CheckAge() throws InvalidAgeException {
		
		if(age < 18) {
			
			throw new InvalidAgeException("Age must be greater than 18");
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Voting v = new Voting(17);
		
		try {
			v.CheckAge();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
