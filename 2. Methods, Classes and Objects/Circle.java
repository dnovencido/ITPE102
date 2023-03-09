public class Circle {
	public static void main(String[] args) {
		System.out.println("The area of circle with a radius of 5.2 is : " + computeArea(5.2));
	}
	public static double computeArea(double radius) {
		return Math.PI * radius * radius;
	}
}