package Week4;

public class Week4Videos {

	public static void main(String[] args) {

		int[] over100 = new int[3];

		over100[0] = 7;
		over100[1] = 44;
		over100[2] = 2;

		// int sum = greaterThan100(over100);
		// System.out.println(sum);

		System.out.println(greaterThan100(over100));

	}

	public static boolean greaterThan100(int[] numbers) {

		// methods will return values of return unless it is a void

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
