package _1_programming_in_java;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String args[]) {
		
		//one dimensional
		
		int num[] = new int[3]; //declaration and instantiation
		num[0] = 5; //initialization
		num[1] = 6;
		num[2] = 8;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		String names[] = {"Binayak","Abiral","Dipesh","Deep","Samir"}; //declaration, instantiation, initialization
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//multidimensional array
		
		int marks[][] = new int[3][3];
		System.out.println("Enter marks of two subjects of three students: ");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(j == 2) {
					
					marks[i][2] = marks[i][0] + marks[i][1]; //total marks in last column
					
				} else {
					
					marks[i][j] = sc.nextInt();
					
				}
				
			}
		}
		
		
		System.out.println("S0\tS1\tTotal");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
