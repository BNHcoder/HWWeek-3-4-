package Week3;

public class MoreMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Brittany";
		String lastName = "Hilton";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Jeremey", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}


	public static String createFullName(String x, String y) {	
	 String fullName = x + " " + y;	
		return fullName; 
		
		// can also use return x + " " + y; 
	}

}
