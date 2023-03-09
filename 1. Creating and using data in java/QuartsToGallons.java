import java.util.Scanner;
public class QuartsToGallons {

	public static main(String args) {
		final int QUARTS_GALLON = 4;
		int paintingJob;

		Scanner input = new Scanner(System.out);
		
		System.out.println("How many quarts of paint do you need for the painting job?");
		paintingJob = input.nextLine();
		
		int gallons = paintingJob / NUMBER_OF_QUARTS;
		float quarts = paintingJob % NUMBER_OF_QUARTS;
		
		System.out.println("A painting job that needs to use " + paintingJob + " quarts requires "
				+ gallons + " gallons and " quarts + " quarts of paint.");

	}
}

}