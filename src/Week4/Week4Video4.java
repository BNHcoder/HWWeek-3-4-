package Week4;



public class Week4Video4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Brittany";
		String lastName = "Hilton";
		
		
		System.out.println(firstName.concat(" " + lastName));
		
		
		
		int[] ages = new int[]{3,9,23,64,2,8,28,93,12};
		
		int sum = 0;
			          
		for (int i = 0; i < ages.length ; i++) {
		sum = sum + ages[i];
		System.out.println(sum / ages.length);

		}	
		
}
	
}


		 

