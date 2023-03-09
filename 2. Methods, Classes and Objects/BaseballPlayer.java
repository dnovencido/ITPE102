public class BaseballPlayer {
	private static int countOfPlayers = 0;
	private int number;
	private double battingAverage;

	public BaseballPlayer(int id, double average) {
		number = id;
		battingAverage = average;
		countOfPlayers = countOfPlayers + 1;
	}

	public void showPlayer() {
		System.out.println(" Player # " + number + " batting average is " + battingAverage + 
		" there are " + countOfPlayers +" players.");
	}
}