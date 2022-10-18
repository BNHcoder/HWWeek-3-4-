
public class Week2booleanLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age = 14;
		System.out.println(age >= 16);
		
		int age2 = 18;
		System.out.println(age2 >= 16);
		
		// add a new variable called hasLicense before conditional (meaning if statement)
		boolean hasLicense = false;
				
		// additional requirement has license means &&
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
			
		} else {
			System.out.println("You cannot drive");
		}

		
	
		
		// create a new variable costOfMilk and thirstLevel 
		// create conditional costOfMilk < 2.5 or thirstLevel >6
		// print No thanks otherwise
		double costOfMilk = 3.5;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.5 || thirstLevel > 6) {
			System.out.println( "Milk Please");
			
		} else {
			
				System.out.println("No Thanks");
			
		}
		
	// can use if (numberOfCookies % numberOfChildren == 0)	{   and then follow the sequence
	// can assign int remainCookies = numberOfCookies % numberOfChildren	
		int numberOfCookies = 10;
		int numberOfChildren = 5;
		
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot");
		
		}else if (numberOfCookies % numberOfChildren >= 2) {
			System.out.println("Whooohooo");
		
	}else if (numberOfCookies % numberOfChildren > 0) {
		System.out.println("Yes");
		
	} else { 
		System.out.println("Sad Face");
	}
		
		
	}

}
