package variables_and_datatypes;

import java.util.Scanner;

// calculate how many months it will take to pay off student loans.
// assume students debt is user input
// no interest rate for the first 6 months. Interest is 2% per month after that.
// minimum payment is %5 of the debt value or $300. Whichever is higher

public class Student_Loans {

	public static void main(String[] args) {
		
		// get user input for student debt
		System.out.println("How much debt do you have?");
		Scanner input = new Scanner(System.in);
		double debt = input.nextInt();
		
		boolean paidOff = false;
		int sixMonths = 6;
		int months = 0;
		
		while (!paidOff) {
			// six months of interest free payments
			if (sixMonths > 0) {
				if (debt * 0.05 > 300)
					debt -= debt*0.05;
				else
					debt -= 300;
				sixMonths -= 1;
				months ++;
			}		
			
			// payments with interest
			else {
				if (debt * 0.05 > 300)
					debt -= debt*0.05;
				else
					debt -= 300;
				debt = debt * 1.02;
				months++;
			}
			// check if debt is paid off
			if (debt <= 0)
				paidOff = true;
		}
		
		System.out.printf("It will take you %d months to pay off your debt!", months);
	}

}
