import java.util.Scanner;

public class MinutesConversion
{
	public static void main(String[] args) 
	{	
		int hours, minutes;
		float days;
		final int MINUTES_HOURS = 60, HOURS_DAY = 24;
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter minutes for conversion >> ");
		
		minutes = keyboard.nextInt();

		hours = minutes / MINUTES_HOURS;
		days = (float) hours / HOURS_DAY;

		System.out.println(minutes + " minutes is equal to " + hours + " hours and " + days + " days.");
	}	
}