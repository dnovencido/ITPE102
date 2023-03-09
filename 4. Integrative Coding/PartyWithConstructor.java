public class PartyWithConstructor {
	private int guest;

	public PartyWithConstructor() {
		guest = 0;
	}

	public PartyWithConstructor(int numGuests) {
		guest = numGuests;
	}

	public int getGuest() {
		return guest;
	}

}