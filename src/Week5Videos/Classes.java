package Week5Videos;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* classes
		 * String
		 * String Builder
		 * Scanner
		 * Array
		 * Array List
		 * 
		 * new StringBuilder becomes an instance of our object and assign to our variable
		 */
		
		
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "508-222-2222";
				
				student1.introduce();
				
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "857-123-4567", 12);
		student3.introduce();
		
		
	}

}
