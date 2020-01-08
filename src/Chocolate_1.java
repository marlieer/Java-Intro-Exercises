import java.util.Scanner;

// calculates the amount of time needed for Augustus Gloop 
// to eat a user-specified amount of chocolate bars
public class Chocolate_1 
{
  public static void main(String[] args) 
  {
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
