package _2_Assignment_1;

interface A{
	void DisplayA();
}

interface B{
	void DisplayB();
}

class MultipleInheritance implements A, B{

	@Override
	public void DisplayB() {
		System.out.println("This is interface B method");
		
	}

	@Override
	public void DisplayA() {
		System.out.println("This is interface A method");
		
	}
	
	public static void main(String args[])
	{
		MultipleInheritance mi = new MultipleInheritance();
		mi.DisplayA();
		mi.DisplayB();
	}
}

