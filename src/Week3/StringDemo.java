package Week3;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String companyName = "Promineo";
		
		String empty = "";
		
		for (int i = companyName.length() - 1; i >= 0; i--)
		{
			empty += companyName.charAt(i);
					
		}
		System.out.println(empty);

		
		
		String thinkTwice = "Think Twice";
		
		String myString[] = thinkTwice.split(" ");
		
		empty = "";
		
		
		int lengthOfmyString = myString.length;
		
		System.out.println(lengthOfmyString);
		
		
		
		
	}
}