import java.util.Scanner;

public class UseParty {
	public static void main(String[] args) {
		int guests;

		DinnerParty aParty = new DinnerParty();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of guests for the party >>> ");
		
		guests = keyboard.nextInt();
		aParty.setGuest(guests);

		System.out.println("The party has " + aParty.getGuest() + " guests. ");
		aParty.displayInvitation();

	}

}