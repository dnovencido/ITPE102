import java.util.ArrayList;

public class PersonArrayList {
	public static void main(String[] args) {
		final int LIMIT = 3;
		
		Person p1 = new Person("Juan", 19);
		Person p2 = new Person("John", 20);
		Person p3 = new Person("Mary", 25);

		ArrayList<Person> persons = new ArrayList<Person>();

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);

		for (int x=0; x<LIMIT; ++x) {
			System.out.println(persons.get(x).getName() + ", " + persons.get(x).getAge());
		}

		// for(Person person : persons) {
		// 	System.out.println("The age of " + person.getName() + " is " + person.getAge());
		// }

	}
}