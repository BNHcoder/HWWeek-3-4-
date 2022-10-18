package Week3;

public class methodsAndReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String firstName = "Brittany";
		String lastName = "Hilton";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Bob", lastName);
		
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		
	}

	public static String createFullName(String x, String y) {
		//String fullName = x + " " + y;
		//return fullName;
		return  x + " " + y; 
		
		//can use to erase above two lines
		
	//note you can return x + " " + y; it will "return the same values
		
		
	// x & y just represent the position but you can name them anything	
		
	}

	}


