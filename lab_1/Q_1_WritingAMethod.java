package lab_1;

public class Q_1_WritingAMethod {

	
	public static void main(String[] args) {
		
		/* Question-1

Write a method that accepts a string and a non-negative number, 
and prints a larger string that is number copies of the original String

stringTimes("Hi", 2); = > HiHi
stringTimes("Hi", 3); = > HiHiHi
stringTimes("Hi", 1); = > Hi    */
		
		methodPractice("Hi", 5);

	}
	public static void methodPractice(String string, int number) {
		  
		String str = "";
		str= str + string;
		for(int i=0; i<number; i++) {
			
			System.out.print(str);
		}
		
	}

}
