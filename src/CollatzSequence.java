import java.util.Scanner;

/*
 * CollatzSequence.java
 * Jasmyn Stansfield
 * Mr Hardman
 * Assignment 4, Program 2
 * November 16, 2016
 */
public class CollatzSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		
		System.out.println("In 1937, Lothar Collatz proposed a sequence, "
				+ "that no matter what number you started with,\nyou would "
				+ "eventually reach 1. If the current number is even, you "
				+ "would divide the number\nby 2, If the current number is "
				+ "odd, you would multiply by 3 and add 1\nPlease enter a "
				+ "Natural number");
		userNum = userInput.nextInt();
		
		do{
			if (userNum % 2 == 0){
				
				userNum = userNum / 2;
				System.out.println(userNum);
			}
			else {
				
				userNum = userNum * 3 + 1;
				System.out.println(userNum);
			}
		}while(userNum != 1);
	
		userInput.close();
	}

}
