package allBasicQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
//Armstrong number is a number that is equal to the sum of cubes of its digits.
		
//0, 1, 153, 370, 371 and 407 are the Armstrong numbers.	
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		checkArmNum(num);

	}

	private static void checkArmNum(int num) {
		
		int temp = num, rev = 0;
		
		//to reverse a number
		
		while(temp != 0) {
			
			int last = temp % 10;
			
			int cube = last * last * last;
			
			rev = rev  + cube;
			
			temp = temp / 10;
		}
		
		//System.out.println(rev);
		
		if(num == rev)
			
			System.out.println(num + " is armstrong number");
		
		else
			
			System.out.println(num + " not is armstrong number");
		
	}

}
