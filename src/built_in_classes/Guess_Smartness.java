package built_in_classes;

import java.util.Scanner;
import java.util.Random;

// write a program that randomly determines a user's smartness based off pulling words from an input sentence
// prompt: Do you love kareoke? Explain
// if response includes "Yes", smartness odds = 50%
// if response includes "No", smartness odds = 20%
// if response includes "singing" or "sing" or "sang", smartness odds += 30%
// if response includes "people", smartness odds += 20%
// output: how smart you are
// hint String class has method contains(string) and a method to convert to lower case

public class Guess_Smartness {

	public static void main(String[] args) {
		
		int odds = 0;
		
		// get user input
		System.out.println("Do you love kareoke? Explain");
		Scanner input = new Scanner(System.in);
		String response = input.next().toLowerCase();
		
		// extract words from input string and calculate smartness odds
		if (response.contains("yes"))
			odds = 50;
		else if (response.contains("no"))
			odds = 20;
		if (response.contains("singing") || response.contains("sing") || response.contains("sang"))
			odds += 30;
		if (response.contains("people"))
			odds += 20;
		
		// generate random number
		Random gen = new Random();
		int smartness = gen.nextInt(100);
		
		// determine smartness and output
		if (smartness < odds)
			System.out.println("You are probably smart!");
		else 
			System.out.println("You may not be smart");
	}

}
