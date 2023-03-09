public class DinnerPartyWithConstructor extends PartyWithConstructor {
	private int dinnerChoice;

	// public DinnerPartyWithConstructor(int numGuest) {
	// 	super(numGuest);
	// }

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int choice) {
		dinnerChoice = choice;
	}

	public void displayInvitation() {
		System.out.println("You are invited to my dinner party");
	}
}