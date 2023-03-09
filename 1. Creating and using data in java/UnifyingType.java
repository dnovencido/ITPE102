public class UnifyingType {
	public static void main(String[] args) {

		//Implicit Type Conversion
		int hoursWorked = 37;
		double payRate = 16.73;

		float grossPay = hoursWorked * payRate;

		System.out.println("The gross pay is " + grossPay);

		//Explicit Type Conversion
		double bankBalance = 189.66;
		float weeklyBudget = (float) (bankBalance / 4);

		System.out.println(weeklyBudget);
	}
}