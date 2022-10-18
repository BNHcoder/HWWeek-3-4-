package Week4;

public class TestWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] ages = new int[]{3,9,23,64,2,8,28,93,12};
		
		int sum = 0;
			          
		for (int i = 0; i < ages.length; i++) {
		sum = sum + ages[i];
		
		int average = sum/ages.length; 
		System.out.println(average);
		
		}		
		
	}

}
