package week1.day3;

import java.util.Arrays;

public class Array_MaxandMin {

	public static void main(String[] args) {
int [] nums = {22,987,998,-90,0,78,89}; //min =-90, max = 998;
Arrays.sort(nums);
System.out.println("the minimum number of this array is "+ nums[0]);
System.out.println("the maximum value is "+ nums[nums.length-1]);

// if i want to print all no.of array
for (int i = 0; i < nums.length; i++) {
	System.out.println(nums[i]);
	
}

	}

}
