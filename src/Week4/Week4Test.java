package Week4;

public class Week4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nameLengths = new String[]{ "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; 
		
		int sum = 0;
				
				for ( int i = 0; i < nameLengths.length; i++)
				
					sum = sum + nameLengths[i].length();
				
				System.out.println(sum);

		
	}

}
