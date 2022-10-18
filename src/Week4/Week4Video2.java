package Week4;

import java.util.ArrayList;
import java.util.List;

public class Week4Video2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] cars = new String [3];
		
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		
		//List like an array but overcomes limitations of an array
		
		// signature List <E> list of E is the generic that will be replaced with the type
		//Array List also called diamond operator
		//List <String> reads as list of string
		
		
		List <String> sports = new ArrayList <String>();
		
		// import Java Util       must use ArrayList and import using Java util as well
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);

		
		

for (int i = 0; i < sports.size(); i++) {
	
	System.out.println(sports.get(i));
	
	}

for (String sport : sports) {
	
	System.out.println(sport);
		
		
	}
	
	List<Integer> numbers = new ArrayList<Integer>();
	//cannot use a primative data types, but does have a corresponding type for this example it is Integer
	//can use is empty to check if there is any


}
}
