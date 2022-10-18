
public class Week2booleanLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write a for loop that prints each number 0 to 9
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		// write a for loop that prints each number 10 to 0
		
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
	}
// print out even numbers 0 to 100
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
//alternative	but less efficient iteratates 100 times	
		for (int i = 0; i <= 100; i++) {
		if (i % 2 == 0);
			System.out.println(i);
}
		
//write a loop that prints 
		for (int i = 0; i <= 100; i++) {	
			if (i % 2 == 0) {
				System.out.println(i + "Even");
			} else { 
				System.out.println(i + "Odd");
			}

	//print remainder to console while loop starts at 100 and iterates back by 1 until 0 divide by 3
	// and print remainder to console
			int ia = 100;
			while (ia > 0 ) {
				System.out.println(ia % 3);
			ia--;
			}
		}
			
		}
}
