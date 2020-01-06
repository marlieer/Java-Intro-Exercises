package loops;

import java.util.Scanner;

// write a program that allows users to feed Augustus Gloop chocolate bars until he is full
// Augustus Gloop can hold up to 20 chocolate points (but no more!)
// user input can be "milk", "dark", or "white"
// milk = 2 chocolate points, dark = 5 chocolate points, white = 3 chocolate points
// after every user input, calculate Augustus's new belly status and display to user, then ask for their user input again
// make sure that Augustus isn't fed too much.

public class Chocolate {

	public static void main(String[] args) {
		
		System.out.println("Augustus Gloop is hungry for chocolate. His belly can hold 20 chocolate points");
		System.out.println("Milk chocolate = 2 chocolate points, dark = 5 points and white = 3 points");
		Scanner input = new Scanner(System.in);
		boolean full = false;
		int belly = 0;
		
		while(!full){
			
			// ask for user input
			System.out.println("What kind of chocolate should Augustus eat next? (milk, white, dark)");
			String chocolate = input.next();
			int points = 0;
			
			if (chocolate.equals("milk"))
				points = 2;
			else if (chocolate.equals("dark"))
				points = 5;
			else if (chocolate.equals("white"))
				points = 3;
			else 
				System.out.println("That's not a valid response! Try again.");
			
			
			// calculate belly fullness
			if (belly + points > 20)
				System.out.println("Augustus can't fit that kind of chocolate! Try again.");
			else {
				belly += points;
				System.out.printf("Augustus's belly is at %d points!\n", belly);
			}
			
			// if full, exit loop
			if (belly > 18)
				full = true;
		}
		
		System.out.println("Great job! Augustus can't fit anymore chocolate.");

	}

}
