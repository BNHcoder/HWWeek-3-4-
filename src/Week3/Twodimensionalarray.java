package Week3;

import java.util.Scanner;

public class Twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] row0= {'A', 'B', 'C', 'D'}; 
		char [] row1= {'D', 'E', 'F', 'G'}; 
		char [] row2= {'H', 'I', 'K', 'L'}; 
		char [ ] row3= {'M', 'N', 'O', 'P'};
		char[][] table = new char[4][4];
		
		//populate the 2 dimensional array
		table[0] = row0;
		table[1] = row1;
		table[2] = row2;
		table[3] = row3;
		
		System.out.println("Please enter coordinates: ");
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		
		
		System.out.println("The data at " + row + ", " + column + " is" + table[row][column]);
	}
}

