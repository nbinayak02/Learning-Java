package _2_Assignment_1;

public class Distance {

	private int feet;
	private float inches;
	
	public Distance(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	public void AddDistance(Distance d1, Distance d2) {
		
		float totalInches = d1.inches + d2.inches;
		int ftFromInches = (int)totalInches/12;
		float remainingInches = totalInches % 12;
		int totalFeet = d1.feet + d2.feet + ftFromInches;
		
		System.out.println(d1.feet+" ft "+d1.inches+" inches + "+d2.feet+" ft "+d2.inches+" inches = "+totalFeet+" ft "+remainingInches+" inches");
		
	}
	
	public void CompareDistance(Distance d1, Distance d2) {
		
		if(d1.feet > d2.feet) {
			
			System.out.println(d1.feet+" ft "+d1.inches+" is greater");
			
		} else if (d1.feet == d2.feet){
			
			if(d1.inches > d2.inches) {
				
				System.out.println(d1.feet+" ft "+d1.inches+" is greater");
				
			} else if(d1.inches == d2.inches) {
				
				System.out.println(d1.feet+" ft "+d1.inches+" is equal to "+d2.feet+" ft "+d2.inches+" inches");
				
			} else {
				
				System.out.println(d2.feet+" ft "+d2.inches+" is greater");

			}
		} else {
			
			System.out.println(d2.feet+" ft "+d2.inches+" is greater");

		}
	}
	
	public static void main(String args[]) {
		Distance d1 = new Distance(1,1);
		Distance d2 = new Distance(1, 1);
		Distance d3 = new Distance(0,0);
		d3.AddDistance(d1, d2);
		d3.CompareDistance(d1, d2);
		
	}
}

