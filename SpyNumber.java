package allBasicQuestions;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		
		//sum and product of all digits are equal is called a spy number.
		
		//22, 132, 123, 
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		boolean ans = isSpy(num);
		
		if(ans) {
			
			System.out.println(num + " is Spy Number.");
			
		}else {
			
			System.out.println(num + " is Not Spy Number.");
		}
	}
	
    static boolean isSpy(int num){
        
        int temp = num;
        
        int sum = 0;
        
        int product = 1;
        
        while(temp != 0){
            
            int last = temp % 10;
            
            sum += last;
            
            product *= last;
            
            temp = temp / 10;
        }
        
        if(sum == product){
            
            return true;
        }
        
        return false;
    }	

}
