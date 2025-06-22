package _1_programming_in_java;


interface Shape{
	float PIE = 3.1415f;
	float findArea();
}

class Circle implements Shape{

	int r;
	
	Circle(int r){
		this.r = r;
	}
	
	@Override
	public float findArea() {
		return PIE * r * r;
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Circle c = new Circle(4);
		System.out.println("Area: "+c.findArea());
	}
	
}
