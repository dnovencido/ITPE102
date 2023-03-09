import javax.swing.JOptionPane;

public class SalaryDialog {
	public static void main(String[] args) {
		String wageString, dependentString;
		double weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK = 40;

		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Employee Salary", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

		dependentString = JOptionPane.showInputDialog(null, "How many dependents?", "Enter dependents", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentString);

		JOptionPane.showMessageDialog(null, "Weekly salary is " + weeklyPay + "\nDeductions will be made for " + dependents + " dependents. ");
	}
}