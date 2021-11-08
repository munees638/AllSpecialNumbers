package allBasicQuestions;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		//sum of the factorial of digits is equal to the original number. 
		
		//145 is strong number. Since, 1! + 4! + 5! = 145
		
		//1, 2, 145, 40585
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		boolean ans = isStrong(num);
		
		if(ans) {
			
			System.out.println(num + " is Strong Number.");
			
		}else {
			
			System.out.println(num + " is Not Strong Number.");
		}		

	}

    static boolean isStrong(int num){
        
        //145 = 1! + 4! + 5!  = 1 + 24 + 120 = 145
        
        int sum = 0;
        
        int temp = num;
        
        while(num != 0){ 
            							
            int last = factorial(num % 10);
            
            sum += last;
            
            num = num / 10;
        }
        
        if(sum == temp){
            
            return true;
        }
        
        return false;
    }
    
    static int factorial(int num){
        
        int fact = 1;
        
        for(int i=1;i<=num;i++){
            
           fact = fact * i; 
        }
        
        return fact;
    }	
}
