

import java.util.Random;
import java.util.Scanner;

// write a program that takes a meme as user input and determines your reaction
// odds that you laugh loudly = 20%, odds that you chuckle = 30%, 
// odds that you force a smile = 10%, odds that you turn away with disgust to hide a smile = 40%

public class Memes {

	public static void main(String[] args) {

		// get user input
		System.out.println("Enter the meme description: ");
		Scanner input = new Scanner(System.in);
		String meme = input.next();
		
		// generate a random number
		Random gen = new Random();
		int odds = gen.nextInt(100);
		System.out.println(odds);
		
		// determine reaction
		if (odds < 20)
			System.out.println("You laugh loudly at this meme");
		else if (odds >= 20 && odds < 50)
			System.out.println("You gave this meme a chuckle");
		else if (odds >= 50 && odds < 60)
			System.out.println("You forced a smile for this meme");
		else
			System.out.println("This meme made you turn away with disgust to hide a smile");
	}

}
