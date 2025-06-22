package _2_Assignment_1;

public class CenteredArray {
	
	int checkCenteredArray( int array[] ) {
		
		//if even length array, return 0
		
		if(array.length % 2 == 0) {
			return 0;
		}
		
		int midIndex = array.length / 2;
		int count = 0;
		
		for( int i = 0; i < array.length; i++ ) {
			
			if(i == midIndex) {
				continue;
			} 
			
			else if( array[i] > array[midIndex] ) {
				
				count++;
				
			} 
			
			
		}
		
		return (count == array.length - 1) ? 1 : 0;
		
	}
	
	public static void main(String[] args) {
		
		int array[] = {60,70,80,90,5,40,30,20,10};
		
		CenteredArray ca = new CenteredArray();
		 int r = ca.checkCenteredArray(array);
		 System.out.println(r);
	}
	
}
