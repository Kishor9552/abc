package logicalnumbers;

import java.util.Scanner;

public class EvenOddNo {

	public static void main(String[] args) {
	
		System.out.println("Enter any no"); 
		Scanner sc = new Scanner(System.in);
		
		if(sc.nextInt() % 2==0) {
			System.out.println("Even no");
		}else {
			System.out.println("Odd number");
		}
		
	}

}
