package _2_Assignment_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RowColumnDiagonalSum {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		int i = 0;
		int rowSum[] = new int[3];
		int array[] = new int[20];
		char fileBuffer[] = new char[20];
		
		try(FileReader fr = new FileReader("E:\\Eclipse IDE Work Space\\Files\\magic.txt")){
			
			fr.read(fileBuffer);
			
			for( char c:fileBuffer) {
				
				array[i] = c;
				i++;
			}
			
			for(int j = 0; j < 20; j++) {
				System.out.println((char)array[j]);
			}
			
		}
		
	}
	
}
