

	import java.util.Scanner;

	// calculate how many months it will take to pay off student loans.
	// assume students debt is user input
	// no interest rate for the first 6 months. Interest is 2% per month after that.
	// minimum payment is %5 of the debt value or $300. Whichever is higher

	public class Student_Loans_2 {
		
		static int months = 0;

		public static void main(String[] args) {
			
			// get user input for student debt
			System.out.println("How much debt do you have?");
			Scanner input = new Scanner(System.in);
			double debt = input.nextInt();
			
			boolean paidOff = false;
			int sixMonths = 6;
			
			while (!paidOff) {
				// six months of interest free payments
				if (sixMonths > 0) {
					debt = makePayment(debt);
					sixMonths -= 1;
				}		
				// payments with interest
				else {
					debt = makePayment(debt);
					debt = debt * 1.02;
				}
				// check if debt is paid off
				if (debt <= 0)
					paidOff = true;
			}
			
			System.out.printf("It will take you %d months to pay off your debt!", months);
		}
		
		public static double makePayment(double debt) {
			if (debt * 0.05 > 300)
				debt -= debt*0.05;
			else
				debt -= 300;
			months ++;
			
			return debt;
		}
}
