package HWweek3and4;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
			 	names array and add the length of each name to the nameLengths array. */
		
		String[] names = new String[] { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
	      
		int[] nameLengths = new int[names.length];
		 for(int i = 0; i < names.length; i++){
		     nameLengths[i] = names[i].length();
		 }
		 
		 //import java util
		 System.out.println(Arrays.toString(nameLengths));
		
		
	}

}
