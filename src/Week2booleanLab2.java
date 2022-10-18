
public class Week2booleanLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String loyaltyMemberStatus = "Gold";
	double loyaltyMemberDiscount = 0.0;
	
	switch(loyaltyMemberStatus) {
	case "Silver":
		loyaltyMemberDiscount = .1;
		break;
	case "Gold":
		loyaltyMemberDiscount = .15;
		break;
	case "Platinum":
		loyaltyMemberDiscount = .25;
		break;
	
		
	}
		System.out.println(loyaltyMemberDiscount);
		
//	create a variable billTotal assign value
//  create a variable adjustedTotal	= 	billTotal minus loyaltyMemberDiscount percent of bill total
	double billTotal = 600;
	double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
	
	System.out.println(adjustedTotal);

	if (adjustedTotal > 500) {

// if adjusted bill total greater than 500 upgrade from silver to gold or gold to platinum	
		if (loyaltyMemberStatus == "Silver") {
			loyaltyMemberStatus = "Gold";
					
		} else if (loyaltyMemberStatus == "Gold") {
			loyaltyMemberStatus = "Platinum";
		}
		System.out.println(loyaltyMemberStatus);
	}

	
// 2 variables username and password 
// create a conditional that prints login successful if username Tommy123 and password 12345
	String username = "Tommy123";
	String password = "12345";
// create a conditional that prints login successful if username is Tommy123 and password is 12345
// equality operator use .equals == when comparing two strings username == becomes username.equals	
	if (username.equals("Tommy123") && password.equals("12345")) {
		System.out.println("login successful");
	} else {
		System.out.println("access denied");
	}
	}
}
	
	
	

		
		
		
		
	


