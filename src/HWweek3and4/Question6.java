package HWweek3and4;

import java.util.Arrays;

public class Question6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*6.	Write a loop to iterate over the nameLengths array and calculate 
		the sum of all the elements in the array. Print the result to the console. */
		
		String[] names = new String[] { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob", };
	      
		int[] nameLengths = new int[names.length];
		 for(int i = 0; i < names.length; i++){
		     nameLengths[i] = names[i].length();
		 }
		 
		
		System.out.println(Arrays.toString(nameLengths));
		
		
		int sum = 0;
		
		for (int i = 0; i < nameLengths.length; i++)
		
		sum = sum + nameLengths[i];
		
		System.out.println(sum);
		
		
	}

}
