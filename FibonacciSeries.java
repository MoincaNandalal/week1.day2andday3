package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		 int firstNum = 0, secNum = 1, sum =0 ,i;    
		 System.out.print(" "+firstNum+"\n"+" "+secNum);//printing 0 and 1    
		    
		 for(i=2;i<11;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  sum = firstNum + secNum;    
		     
		  firstNum = secNum;    
		  secNum = sum;   
		  System.out.print("\n"+" "+sum); 
		 }    

	}

}
