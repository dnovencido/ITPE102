import java.util.Scanner;

public class InchesToFeet
{
	public static void main(String[] args) 
	{
		int length, inches, feet;
		final int FEET_INCHES = 12; // 1 FEET = 12 inches

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length in inches >> ");
		length = input.nextInt();

		feet = length / FEET_INCHES; // length (inches) / 12 (1 FEET)
		inches = length % FEET_INCHES; // the remainder will be the remaining inches.

		System.out.println(length + " inches is equal to " + feet + " feet and " + inches + " inches");
	}
}