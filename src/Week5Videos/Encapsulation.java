package Week5Videos;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * works but is considered poor practice must use an access modifier there are 3
		 * or nothing
		 * 
		 * access modifiers public accessible everywhere
		 * 
		 * 
		 * private Only accessible within class itself
		 * 
		 * 
		 * protected accessible within class, other classes in the same package and ALL
		 * subclasses
		 * 
		 * 
		 * None or no modifier Same as protected, except not accesible to subclasses in
		 * different package
		 * 
		 * 
		 */

		Student student = new Student();
		student.setFirstName("Sally");
		student.setGradeLevel(6);
		student.setPhoneNumber("12334567890");
		student.introduce();

		// System.out.println(student.getFirstName());

	}

}
