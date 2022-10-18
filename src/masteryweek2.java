import java.util.Random;

public class masteryweek2 {


		// TODO Auto-generated method stub
	public static void main(String[] args) {
		
	double assignment1 = 100;
	double assignment2 = 60;
	double assignment3 = 62;
	double assignment4 = 70;
	double assign1and2 = assignment1 + assignment2;
	
	System.out.println(assign1and2);
	
	if (assignment1 + assignment2 > 150 && assignment3 > 70 || assignment4 > 70) {
	System.out.println("You Passed the Class");
	
	} else {
	
		System.out.println("You Failed the Class");	
		
	}
	
	boolean isHot = false;
	boolean isRaining = true;
	boolean isWindy = true;
	
	
	System.out.println(( isRaining || isHot) && isWindy);
	
	int a = 495;
	int b = 243;		
	 if ((a * b) % 2 == 0) {
	     
	    System.out.println("even");
	         
	     } else {
	        System.out.println("odd");
	     }	
	
	int num1 = 3;
	char letter;
	
	switch (num1) {
	case 1:
		letter = 'a';
	break;
	
	case 2:
		letter = 'b';
	break;
	

	case 3:
		letter = 'c';
	break;
	

	case 4:
		letter = 'd';
	break;
	
	default:
		letter = 'z';
	}
	System.out.println(letter);
	
	
	int num  = 70;
	if (num < 100) {
		System.out.println("number is less than 100");
		if (num > 50) {
			System.out.println("number is greater than 50");
		}
	}
	
	Random rand = new Random();
	
	int randomNumber = rand.nextInt(60);
	if (randomNumber < 20 ) {
		System.out.println();
	}
	
	int counter = 0;
	
	for ( int i = 1; i < 100; i += 2 ) {
		counter++;
		
		System.out.println(counter);
	}
	
	int y = 0;
	do {
		
		System.out.println("I will print!");
		y++;
	} while ( y > 1 );
	}

	
}
}
	


	
	
	
	
