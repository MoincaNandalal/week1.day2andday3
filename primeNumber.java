package week1.day2;

import java.util.Scanner;

public class primeNumber {

	
	public static void main(String[] args) {
		
		int input = 7;
		boolean bprime = true;
		for (int i = 2; i < input - 1; i++) {
			if (input%i == 0) {
				System.out.println("Non-Prime");
				bprime = false;
				break;
				
			}
			
		}
		if (bprime) {
			System.out.println("Prime");
			
		}
		
		
		
	}
	
//		public static void main(String[] args) {
//			
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Entered number is prime number or not: ");
//	        int number= sc.nextInt();
//	        if(isPrime(number)) {
//	            System.out.println(number + " is prime number");
//	        }
//	        else{
//	            System.out.println(number + " is a non-prime number");
//	        }
//	    }
//	    static  boolean isPrime(int num)
//	    {
//	        if(num<=1)
//	        {
//	            return false;
//	        }
//	       for(int i=2;i<=num/2;i++)
//	       {
//	           if((num%i)==0)
//	               return  false;
//	       }
//	       return true;
//	    }
//		
//		
	

}
