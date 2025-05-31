class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}

class Employee extends Person {
	private String employeeId;
	private String jobTitle;

	public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	@Override
	public String getLastName() {
		return super.getLastName() + "," + getJobTitle();
	}
}

public class Details {
	public static void main(String[] args) {
		Employee emp = new Employee("Chaitanya", "Pamarthi", "PC23032", "Java Full Stack Web Developer");

		System.out.println(emp.getFirstName() + " " + emp.getLastName() + "," + emp.getEmployeeId());
	}
}