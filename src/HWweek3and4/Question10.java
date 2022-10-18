package HWweek3and4;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 10. Write a method that takes an array of double and returns the average of
		 all the elements in the array. */

		double[] myArray = new double[3];

		myArray[0] = 7.14;
		myArray[1] = 9.23;
		myArray[2] = 2.99;

		System.out.println(averageDouble(myArray));

	}

	public static double averageDouble(double arr[]) {
		double sum = 0.0;
		for (double num : arr) {

			sum += num;
		}
		return sum / arr.length;

	}

}
