package Lab11;

import java.util.Arrays;
import java.util.Date;

public class PersonTest {

	public static void main(String[] args) {

		Person[] ps = new Person[5];

		ps[0] = new Faculty("Andy", new Date("11/12/1980"), 4000.0);
		ps[1] = new Faculty("Barry", new Date("1/2/1973"), 6000.0);
		ps[2] = new Staff("Cathy", new Date("8/19/1968"), 2000.0, (int) 3.0);
		ps[3] = new Staff("Don", new Date("4/17/1969"), 4000.0, (int) 2.0);
		ps[4] = new Staff("Edith", new Date("10/28/1979"), 5000.0, (int) 1.0);
		
		

		// Arrays.sort(ps,(a,b) -> b.getSalary().compareTo(a.getSalary()));
		// http://stackoverflow.com/questions/18895915/how-to-sort-an-array-of-objects-in-java

		Arrays.sort(ps);
		for (int i = 0; i <= ps.length - 1; i++) {
			System.out.println(ps[i]);
		}
		System.out.println();
		System.out.println("Faculty");
		for (int i = 0; i <= ps.length - 1; i++) {

			if (ps[i] instanceof Faculty) {
				System.out.println("Name " + ps[i].getName() + " Salary: " + ps[i].getSalary());
			}

		}
		System.out.println();
		System.out.println("Staff");
		for (int i = 0; i <= ps.length - 1; i++) {

			if (ps[i] instanceof Staff) {
				System.out.println("Name " + ps[i].getName() + " Salary: " + ps[i].getSalary());
			}

		}

	}

}
