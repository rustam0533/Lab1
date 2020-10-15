package lab_1;

public class Q_3_SpecialNumber {

	public static void main(String[] args) {
		/*  Question-3

We'll say a number is special if it is a multiple of 11 or 
if it is one more than a multiple of 11. 
Write a method that accepts a number and prints true if the given number is special.

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false   */
		
		number11Special(122);

	}
	
	public static void number11Special(int a) {
		
		if(a%11==0 || a%11==1) {
			System.out.println("true");
		}
		
	}

}
