package Week3;

public class StringandStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String firstName = "Sally"; 
		String lastName = "Smith"; 
		System.out.println(firstName + " " + lastName);
		
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		
		System.out.println(firstName.concat(lastName));
			
		
		
		
	}

	
	public static String multiplyString(String str, int num) {
		
		String result = "";
		for (int i = 0; i < num; i++) {
		result += str;
		
	}
	
	return result;
}
}