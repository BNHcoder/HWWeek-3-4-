package Week5Videos;

public class Student {

	/*
	 * in classes we use Pascal case like StringBuilder, varible names are in camel
	 * case
	 * 
	 * static means shared across class
	 */

	private String firstName; /* want to assign to this info */
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;

	/* constructor you don't put name of class */
	public Student() {
	}

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}

	// TODO Auto-generated constructor stub

	public void introduce() {

		System.out.println("My name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);

	}

	private boolean lengthCheck(String str, int length) {

		return str.length() > length;

	}

	public void setFirstName(String firstName) {
		if (lengthCheck(firstName, 1)) {
			this.firstName = firstName;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		if (lengthCheck(lastName, 1)) {
			this.lastName = lastName;

		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (lengthCheck(phoneNumber, 10)) {

			this.phoneNumber = phoneNumber;
		}

	}

	public String getPhoneNumber() {
		return phoneNumber;

	}

	public void setGradeLevel(int gradeLevel) {
		
		if(gradeLevel  > 0 && gradeLevel < 13) {
			this.gradeLevel = gradeLevel;
	}
	
	}
	public int getgradeLevel() {
		
	
		return gradeLevel;

	}
}
