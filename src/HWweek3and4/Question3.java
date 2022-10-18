package HWweek3and4;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		 a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console. */

		
		String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		int sum = 0;

		for( int i=0; i <names.length; i++)

		sum = sum + names[i].length();

		System.out.println(sum /names.length);


		
	}

}
