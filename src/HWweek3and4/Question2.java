package HWweek3and4;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		int[] ages = new int[] { 3, 9, 23, 64, 2, 8, 28, 93, 12 };

		int sum = 0;

		for (int i = 0; i <= ages.length - 1; i++)

			sum += ages[i];

		System.out.println(sum / ages.length);

	}

}
