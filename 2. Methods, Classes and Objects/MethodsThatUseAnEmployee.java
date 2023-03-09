import java.util.Scanner;

public class MethodsThatUseAnEmployee {
	public static void main(String[] args) {
		Employee myEmployee;
		myEmployee = getEmployeeData();
		displayEmployee(myEmployee);
	}

	public static Employee getEmployeeData() {
		Employee tempEmp = new Employee();
		int id;
		double salary;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee id >> ");
		id = input.nextInt();
		tempEmp.setEmpNum(id);

		System.out.print("Enter employee salary >> ");
		salary = input.nextDouble();
		tempEmp.setEmpSalary(salary);

		return tempEmp;
	}

	public static void displayEmployee(Employee emp) {
		System.out.println("Employee number : " + emp.getEmpNum() + "\nSalary : " + emp.getEmpSalary());
	}
}