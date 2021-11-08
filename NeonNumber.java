package allBasicQuestions;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		
		//the sum of digits of square of the number is equal to the number.
		
		// 9*9 = 81 = 8 + 1 = 9
		
		//0, 1, 9 are the only neon numbers.
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		boolean ans = isNeon(num);
		
		if(ans) {
			
			System.out.println(num + " is Neon Number.");
			
		}else {
			
			System.out.println(num + " is Not Neon Number.");
		}
		
	}
	
	  static boolean isNeon (int num)//9
	  {

	    int square = num * num;// 81 =  8+1 = 9

	    int sum = 0;

	    while (square != 0)
	      {

		int last = square % 10;

		sum = sum + last;

		square = square / 10;
	      }

	    if (sum == num)

	      return true;

	    return false;
	  }	

}
