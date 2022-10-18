package Week3;

public class StringBuilderVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String firstName = "Sally"; 
		String lastName = "Smith"; 
		System.out.println(firstName + " " + lastName);
		
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		
		System.out.println(firstName.concat(lastName));
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
		System.out.println(fullName.deleteCharAt(1));
		System.out.println(fullName.delete(1,3));
		System.out.println(fullName.indexOf("mi"));
		System.out.println(fullName.replace(1,6, "Thompson"));
		System.out.println(fullName.reverse());
		
		
		
		
		
		
		//	
		
	}

public static String multiplyString(String str, int num) {
		
		StringBuilder result = new StringBuilder(); 
		for (int i = 0; i < num; i++) {
		result.append(str);
		
		}
return result.toString();	
}
}
