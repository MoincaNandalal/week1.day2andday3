package week1.day3;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] data = {14,15,18,14,19,18,20};
		// to sort array
		Arrays.sort(data);
		for (int i = 0; i < data.length-1; i++) {
			
			if (data[i]==data[i+1]) {
				System.out.println(data[i]);
				
			}
			
		}
	}  

}
