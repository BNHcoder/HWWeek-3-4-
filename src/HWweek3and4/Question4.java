package HWweek3and4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* b.	Use a loop to iterate through the array again and concatenate all the names together, 
		separated by spaces, and print the result to the console. */

		String[] names = new String[]{ "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		String concatName= names[0];
				
		for(int i = 1; i <=names.length - 1; i++)

		concatName = concatName.concat(" " + names[i]);

		System.out.println(concatName);    

		
		
		
	}

}
