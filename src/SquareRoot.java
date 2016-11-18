import java.util.Scanner;

/*
 * SquareRoot.java
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 4, Program 2
 * November 9, 2016
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		double userNum;
		double sqrt;
		
		System.out.println("Please enter a number you would like to find the square root of:");
		userNum = userInput.nextDouble();
		
		do{
			if(userNum < 0){
				
				System.out.println("Please enter a positive number.");
				
			}
			else {
				
				sqrt = Math.sqrt(userNum);
				System.out.println("The square root of " + userNum + " is " + sqrt + ".");
				
			}
		} while (userNum < 0);
	
		userInput.close();
	}

}
