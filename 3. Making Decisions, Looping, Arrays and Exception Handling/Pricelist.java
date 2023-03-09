import java.util.Scanner;
public class Pricelist {
	private static final double[] prices = { 15.99, 27.88, 34.56, 45.89 };
	
	public static void main(String[] args) {
		int item;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter item number >> ");
		item = input.nextInt();

		try {
			display(item);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Price is $0");
		}
	
	}

	public static void display(int item) throws IndexOutOfBoundsException{
		System.out.println("The price is $" + prices[item]);
	}
}