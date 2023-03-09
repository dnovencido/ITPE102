import java.util.Scanner;

public class DollarDenom {
	public static void main(String[] args) {
		double money;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter amount in dollar >> ");
		money = input.nextDouble();

		int denom20s = (int) money / 20;
		int totalDenom20 = denom20s * 20;
		
		int denom10s = (int) (money - (totalDenom20)) / 10;
		int totalDenom10 = denom10s * 10;

		int denom5s = (int) (money - (totalDenom20 + totalDenom10)) / 5;
		int totalDenom5 = denom5s * 5;

		int denom1s = (int) (money - (totalDenom20 + totalDenom10 + totalDenom5)) / 1;

		System.out.println("You have " + denom20s + " twenty dollar bills.");
		System.out.println("You have " + denom10s + " ten dollar bills.");
		System.out.println("You have " + denom5s + " five dollar bills.");
		System.out.println("You have " + denom1s + " one dollar bills.");
	
	}
}