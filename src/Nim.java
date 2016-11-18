import java.util.Random;
import java.util.Scanner;

/*
 * nim.java
 * Jasmyn Stansfield
 * Mr.Hardman
 * Assignment 4, program 5
 * November 18, 2016
 * This program is incomplete
 */
public class Nim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		String playerOne;
		String playerTwo;
		String pile;
		int pileA;
		int pileB;
		int pileC;
		int total;
		int remove;
		int pickedLast = 1;
		
		
		
		System.out.println("Player one, please enter your name");
		playerOne = userInput.nextLine();
		
		System.out.println("Player two, please enter your name");
		playerTwo = userInput.nextLine();
		
		Random GeneratorA = new Random();
		pileA = GeneratorA.nextInt(9) + 1;
		
		Random GeneratorB = new Random();
		pileB = GeneratorB.nextInt(9) + 1;
		
		Random GeneratorC = new Random();
		pileC = GeneratorC.nextInt(9) + 1;
		
		total = pileA + pileB + pileC;
		
		do{
			
			
			
			//Player One
			while(total > 0){
			
			System.out.println(playerOne + ", pick a pile.");
			System.out.println("A: " + pileA + "\nB: " + pileB + "\nC: " + pileC);
			pile = userInput.next();
				
			if (pile.equalsIgnoreCase("A")){
			
				
				System.out.println("How many would you like to remove from pile A?");
				remove = userInput.nextInt();
				
				pileA = pileA - remove;
				pickedLast = 1;
				
				
			} else if (pile.equalsIgnoreCase("B")){
				
				
				System.out.println("How many would you like to remove from pile B?");
				remove = userInput.nextInt();
				
				pileB = pileB - remove;
				pickedLast = 1;
				
			} else if (pile.equalsIgnoreCase("C")){
				
				
				System.out.println("How many would you like to remove from pile C?");
				remove = userInput.nextInt();
				
				pileC = pileC - remove;
				pickedLast = 1;
				
			}
			
			
		}
			
			
			
			//Player Two
			while (total > 0){	
			
			System.out.println(playerTwo + ", pick a pile.");
				System.out.println("A: " + pileA + "\nB: " + pileB + "\nC: " + pileC);
				pile = userInput.next();
				
				if (pile.equalsIgnoreCase("A")){
			
				
				System.out.println("How many would you like to remove from pile A?");
				remove = userInput.nextInt();
				
				pileA = pileA - remove;
				pickedLast = 2;
				
			}
			else if (pile.equalsIgnoreCase("B")){
				
				System.out.println("How many would you like to remove from pile B?");
				remove = userInput.nextInt();
				
				pileB = pileB - remove;
				pickedLast = 2;
				
			}
			else if (pile.equalsIgnoreCase("C")){
	
				System.out.println("How many would you like to remove from pile C?");
				remove = userInput.nextInt();
				
				pileC = pileC - remove;
				pickedLast = 2;
				
			}
			
				
		}
		
		
		userInput.close();
		
		
		}while(total > 0);
		
		
		if (pickedLast == 1){
			
			System.out.println("Congratulations " + playerOne + ", you won!");
			
		} else {
			
			System.out.println("Congratulations " + playerTwo + ", you won!");
		}

		
	}
	
}
	
