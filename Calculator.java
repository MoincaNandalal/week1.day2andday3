package week1.day2;

public class Calculator {
	public  int sub(int a, int b) {

		return b-a;
	}
	public int mul(int a, int b) {

		return a*b;
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.sub(10, 5));
		System.out.println(obj.mul(5, 5));
	}

}
