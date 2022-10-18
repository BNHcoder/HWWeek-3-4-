package HWweek3and4;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Write a method called willBuyDrink that takes a boolean isHotOutside, and a
		 double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
		 is greater than 10.50. */

		System.out.println(willBuyDrink(true, 22.5));

	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

		return ((isHotOutside == true) && (10.5 < moneyInPocket));

		

	}
}
