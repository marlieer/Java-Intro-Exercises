package variables_and_datatypes;
import java.util.Scanner;

// write a program that predicts how long it takes Augustus Gloop to eat chocolate
// user input determines how many chocolate bars there are (milk, dark, white)
// he takes 2 minutes to eat 1 milk chocolate bar
// he takes 5 minutes to eat 1 dark chocolate bar
// he takes 3 minutes to eat 1 white chocolate bar
// he cannot eat chocolate bars simultaneously

public class Chocolate {

	public static void main(String[] args) {
		
		// ask user for chocolate bar input
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many milk chocolate bars should Augustus Gloop eat?");
		int milk = input.nextInt();
		
		System.out.println("How many dark chocolate bars should Augustus Gloop eat?");
		int dark = input.nextInt();
		
		System.out.println("How many white chocolate bars should Augustus Gloop eat?");
		int white = input.nextInt();
		
		// calculate time
		int minutes = milk*2 + dark*5 + white*3;
		
		// display result to user
		System.out.printf("It will take Augustus Gloop %d minutes to eat all that chocolate!", minutes);
		
		input.close();
		

	}

}
