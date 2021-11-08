package allBasicQuestions;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//sum of all factors excluding itself
		
		// 6 28 496 8128
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt(); 
		
		boolean ans = isPerfect(num);
		
		if(ans) {
			
			System.out.println(num + " is Perfect Number.");
			
		}else {
			
			System.out.println(num + " is Not Perfect Number.");
		}		

	}
	
	static boolean isPerfect(int num) {
		
		int sum = 0;
		
		for(int i=1;i<num;i++) {
			
			if(num % i == 0) {
				
				sum += i;
			}
		}
		
		if(num == sum) {
			
			return true;
		}
		
		return false;
	}

}
