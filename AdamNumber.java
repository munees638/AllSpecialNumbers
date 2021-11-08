package allBasicQuestions;

import java.util.Scanner;

public class AdamNumber {
	
	public static void main(String[] args) {
	    
//Adam number is a number when reversed, the square of the number and 
		
//the square of the reversed number should be numbers which are reverse of each other.

//Adam numbers upto 1000 are: 0, 1, 2, 3, 11, 12, 13, 21, 22, 31, 101, 102, 103, 111, 112 
		
//113, 121, 122, 201, 202, 211, 212, 221, 301, 311
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
	    
	   boolean ans = isAdam(num);
	   
	   if(ans){
	       
	       System.out.println(num + " is Adam Number.");
	       
	   }else{
	       
	       System.out.println(num + " is not Adam Number.");
	   }
	   
	}
	
	static boolean isAdam(int num){
	    
	    //             12       21         441       144                                            
	  // return  reverseNum((int)Math.sqrt((reverseNum(num*num))));
	  
	  int squareOfNum = num*num; //12 * 12 = 144
	  
	  int revNumSquare = reverseNum(squareOfNum); // 441 
    
      int squareRootOfRev =  (int)Math.sqrt(revNumSquare);// 21
      
      int adam = reverseNum(squareRootOfRev); //12
      
      if(adam == num){
          
          return true;
      }
      
      return false;
	}
	
	static int reverseNum(int num){
	    
	    int rev = 0;
	    
	    while(num != 0){
	        
	        rev = rev * 10 + num % 10;
	        
	        num = num / 10;
	    }
	    
	    return rev;
	}

}

