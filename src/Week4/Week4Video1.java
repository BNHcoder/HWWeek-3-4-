package Week4;

public class Week4Video1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String firstName = "Sally";
		String lastName = "Smith";
		
		System.out.println(firstName + " " + lastName);
		
		
		System.out.println(firstName.concat(" " + lastName));
		
		System.out.println(firstName);
		
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		
		System.out.println(fullName.charAt(5));
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
	}

	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
				
		result.append(str);
		
				}
	return result.toString();
}
	}
		



	
	
	
	
	

