package week1.day3;

import java.util.Arrays;
import java.util.Iterator;

public class IsAnagram {

	public static void main(String[] args) {
String str1 = "hello";
//convert string to array
char[] ch1 = str1.toCharArray();
// sort the array
Arrays.sort(ch1);
String str2 = "oelhl";
// convert the second string to char array
char[] ch2 = str2.toCharArray();
//sort the array
Arrays.sort(ch2);
//declare a boolean variable
boolean bAnagram = true;
//iterate through forloop
for (int i = 0; i < ch2.length; i++) {
	// check whether both array are equal
	if (ch1[i]!=ch2[i]) {
		//print it is not anagram
		System.out.println("Not Anagram");
		bAnagram = false;
		break;
		}
}
//if it is true 
if (bAnagram) {
	//print it is anagram
	System.out.println("Anagram");
	
}
		
		
		
	}

}
