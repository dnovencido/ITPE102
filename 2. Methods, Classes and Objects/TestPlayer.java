public class TestPlayer {
	public static void main(String[] args) {
		BaseballPlayer catcher = new BaseballPlayer(12, .218);
		BaseballPlayer shortStop = new BaseballPlayer(31, .385);

		catcher.showPlayer();
		shortStop.showPlayer();

		BaseballPlayer outFielder = new BaseballPlayer(44, .508);
		
		outFielder.showPlayer();
		shortStop.showPlayer();
	}

}