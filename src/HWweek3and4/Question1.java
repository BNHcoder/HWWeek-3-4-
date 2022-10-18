package HWweek3and4;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		a.	Programmatically subtract the value of the first element in the array from the value in the 
		     last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  



		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
				 will add value 12
				
		System.out.println(ages[i]);   will print all values */

		

			int[] ages = new int[]{3,9,23,64,2,8,28,93,12};		

					System.out.println(ages[ages.length-1] - ages[0]);  

		
	}

}
