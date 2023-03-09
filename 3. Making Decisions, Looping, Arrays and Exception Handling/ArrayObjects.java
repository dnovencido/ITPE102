public class ArrayObjects {
	public static void main(String[] args) {
		Employee[] emps = new Employee[2];

		final String[] names = { "Juan", "Ben" };

		final int START_EMP_NUM = 101;
		final double STARTING_SALARY = 15_000;

		// Traditional for loop
		for(int x=0; x<emps.length; ++x) {
			emps[x] = new Employee(names[x], START_EMP_NUM + x, STARTING_SALARY);
			//System.out.println(emps[x].getEmpName() + " with an id number of " + emps[x].getEmpNum() + " has a salary amounting to $" + emps[x].getEmpSalary());
		}

		// Enhanced for loop
		for(Employee worker : emps) {
			System.out.println(worker.getEmpName() + " with an id number of " + worker.getEmpNum() + " has a salary amounting to $" + worker.getEmpSalary());
		}
	}
}