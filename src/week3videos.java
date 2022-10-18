
public class week3videos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// you'll need multiple variables that are different but similar what I mean by
		//that is for example if you have let's say you're writing a program to keep
		//track of all the names of students as a teacher you might have a bunch of
		//different variables for all of your students names for example we'll start
		//here by creating a new class and I'm gonna call this class students a public
		//method or my main method all right so let's say I have I've got three
		
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
	String[] students = new	String[3];   //this is how you denote an array and number of elements is 3 in this case but depends on how many
		
	students[0]	= "Tom Sawyer";
	students[1]	= "Jack Smith";
	students[2]	= "Bill Turner";
	
	System.out.println(students[0]);
	System.out.println(students[1]);
	System.out.println(students[2]);
	
	
	for (int i = 0; i < students.length; i++) {   // length is equivalent to student array or number of students
	System.out.println(students[i]);
	
	System.out.println("Hello to separate code");
	
	for (String student : students) {      // for each student in students
	
		System.out.println(student);       // already declared as a variable in line 37
	
	}
	}
}
}
	


