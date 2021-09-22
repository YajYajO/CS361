/**
 * 
 */
package employee;

/**
 * @author Jon-Joel Ocfemia
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints "PART TIME EMPLOYEE" because emp3 refers to the class PartTimeEmployee.
		// emp3.getHourlyRate(); // returns syntax error because it is originally an employee and doesn't have all of the PartTimeEmployee methods
		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		// if (emp3.whoAmI() != "Employee") {
		// System.out.println("emp3 instance of part time employee"); // printed
		// } else {
		System.out.println("emp3 not instance of part time employee");
		// }

		// Downcasting 1
		// TODO Uncomment and run the code
		PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles / does not compile
		//Answer: Does not Compile
		// This instruction returns a ClassCastException at run time
		// because Employee cannot be cast to PartTimeEmployee

		// Downcasting 2
		// Requires the use of intance of to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
