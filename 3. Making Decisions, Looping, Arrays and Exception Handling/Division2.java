	import java.util.Scanner;
public class Division2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, denominator, result;

		System.out.print("Enter numerator >> ");
		numerator = input.nextInt();

		System.out.print("Enter denominator >> ");
		denominator = input.nextInt();

		try {
			result = numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		} catch(ArithmeticException error) {
			System.out.println("Arithmetic exception was thrown and caught" + error.getMessage());
		} finally {
			System.out.println("Program is terminated.");
		}

	}
}