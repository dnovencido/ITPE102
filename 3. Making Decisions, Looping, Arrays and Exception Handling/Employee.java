public class Employee {
	private int empNum;
	private String empName;
	private double empSalary;

	public Employee(String empName, int empNum, double empSalary) {
		this.empName = empName;
		this.empNum = empNum;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpNum() {
		return empNum;
	}

	public double getEmpSalary() {
		return empSalary;
	}
}