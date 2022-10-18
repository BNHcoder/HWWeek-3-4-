package HWweek3and4;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word 
		        concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method 
		        to return “HelloHelloHello”). */
		
		
		String color = multiplyString("Purple", 5);
		System.out.println(color);

		
		
	}

	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			
			result += str;
		}
			return result;
	}
	
}
	
	

