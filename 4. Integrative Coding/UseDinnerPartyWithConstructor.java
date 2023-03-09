public class UseDinnerPartyWithConstructor {
	public static void main(String[] args) {
		
		DinnerPartyWithConstructor aDinnerParty = new DinnerPartyWithConstructor();
		aDinnerParty.setDinnerChoice(1);

		System.out.println("The number of guest is >> " + aDinnerParty.getGuest() + " and the dinner choice is " + aDinnerParty.getDinnerChoice());
	}
}