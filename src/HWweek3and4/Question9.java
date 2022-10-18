package HWweek3and4;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. */
		
		int[] over100 = new int[3];

		over100[0] = 7;
		over100[1] = 44;
		over100[2] = 2;

		

		System.out.println(greaterThan100(over100));

		
	}

	public static boolean greaterThan100(int[] numbers) {


		int sum = 0;

		for (int number : numbers) {

			sum += number;

		}
		if (sum > 100) {

			return true;

		} else {

			return false;
		}
	
	}
}
