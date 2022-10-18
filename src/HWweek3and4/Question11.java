package HWweek3and4;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //11. Write a method that takes two arrays of double and returns true if the
		// average of
		/* the elements in the first array is greater than the average of the elements
		 in the second array. */

		double[] myArray1 = new double[2];
		// value of 2 elements in array

		myArray1[0] = 3.2;
		myArray1[1] = 7.8;

		double[] myArray2 = new double[2];

		myArray2[0] = 2.2;
		myArray2[1] = 1.2;

		System.out.println(isGreaterAverage(myArray1, myArray2));

	}

	public static boolean isGreaterAverage(double myArray1[], double myArray2[]) {

		double sum1 = 0.0;
		for (double num1 : myArray1) {

			sum1 += num1;
		}
		double average1 = sum1 / myArray1.length;

		double sum2 = 0.0;
		for (double num2 : myArray2) {

			sum2 += num2;
		}
		double average2 = sum2 / myArray2.length;

		if (average1 > average2) {
			return true;

		} else {

			return false;
		}

	}

}
