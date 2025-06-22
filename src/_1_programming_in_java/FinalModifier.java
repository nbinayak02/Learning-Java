package _1_programming_in_java;

public class FinalModifier {
	
	public final class A {
		
		final void Show() {
			
			System.out.println("A");
		}
		
	}
	
//	public class B extends A{ Error: cannot inherit final class
//		
////		void Show() { Error: cannot override final method, remove final keyword form class A and check
//		
////			System.out.println("B");
//		
////		}
//		
//	}

	public static void main (String[] args) {
	
		
		final int x = 200;
		System.out.println("X = "+x);
		
//		x = 98; Error: Cannot reassign final local variable
//		System.out.println("X = "+x);
	}
	
}
