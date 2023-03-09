public class Employee {
	private int empNum;
	private String empLastName;
	private String empFirstName;
	private double empSalary;

	public Employee(int empId){
		empNum = empId;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int emp) {
		empNum = emp;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String lastName) {
		empLastName = lastName;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String firstName) {
		empFirstName = firstName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double salary) {
		empSalary = salary;
	}

}
