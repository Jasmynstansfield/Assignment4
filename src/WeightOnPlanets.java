import java.util.Scanner;

/*
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 4, Program 1
 * November 9, 2016
 */

public class WeightOnPlanets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		double weight;
		double spaceWeight;
		String planet;
		
		System.out.println("Please enter your weight");
		weight = userInput.nextDouble();
	
		System.out.println("Pick a celestial body you would like to travel to.");
		planet = userInput.next();
		
		if (planet.equalsIgnoreCase("Mercury")) {
			
			spaceWeight = weight * 0.38;
			
			System.out.println("You would weight " + spaceWeight + " on Mercury!");
		}
		else if (planet.equalsIgnoreCase("Venus")) {
			
			spaceWeight = weight * 0.91;
			
			System.out.println("You would weight " + spaceWeight + " on Venus!");
		}
		else if (planet.equalsIgnoreCase("Earth")) {
			
			spaceWeight = weight * 1;
			
			System.out.println("You would weight " + spaceWeight + " on Earth! (obviously)");
		}
		else if (planet.equalsIgnoreCase("Moon")) {
			
			spaceWeight = weight * 0.165;
			
			System.out.println("You would weight " + spaceWeight + " on the Moon!");
		}
		else if (planet.equalsIgnoreCase("Mars")) {
			
			spaceWeight = weight * 0.38;
			
			System.out.println("You would weight " + spaceWeight + " on Mars!");
		}
		else if (planet.equalsIgnoreCase("Jupiter")) {
			
			spaceWeight = weight * 2.34;
			
			System.out.println("You would weight " + spaceWeight + " on Jupiter!");
		}
		else if (planet.equalsIgnoreCase("Saturn")) {
			
			spaceWeight = weight * 1.06;
			
			System.out.println("You would weight " + spaceWeight + " on Saturn!");
		}
		else if (planet.equalsIgnoreCase("Uranus")) {
			
			spaceWeight = weight * 0.92;
			
			System.out.println("You would weight " + spaceWeight + " on Uranus!");
		}		
		else if (planet.equalsIgnoreCase("Neptune")) {
			
			spaceWeight = weight * 1.19;
			
			System.out.println("You would weight " + spaceWeight + " on Neptune!");
		}
		else if (planet.equalsIgnoreCase("Pluto")) {
			
			spaceWeight = weight * 0.06;
			
			System.out.println("You would weight " + spaceWeight + " on Pluto!");
		}
		
		userInput.close();
	}

}
