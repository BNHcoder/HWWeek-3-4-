package Week3;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] multiplesOf3 = new int[10];
		
		for (int i = 1; i<= multiplesOf3.length; i++) {
			// i started at 1 remember array will start at 0 need to subtract 1
			multiplesOf3[i-1] = i * 3;
			
			System.out.println("number: " + multiplesOf3[i-1]);
			
		}
		
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		
		
		}
	}
}