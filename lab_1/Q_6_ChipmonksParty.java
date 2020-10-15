package lab_1;

public class Q_6_ChipmonksParty {

	public static void main(String[] args) {
		/*  Question-6

When chipmunks get together for a party, they like to have cigars.
A chipmunk party is successful when the number of cigars is between 40 and 60.
 Unless it is the weekend, in which case there is no upper bound on the number of
  cigars. Write a method that accepts number of cigars and a boolean for weekend, 
  and prints true if the party with the given values is successful, or false
   otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true    */
		                   
		
		              chimpmunksParty(75,true);
		                      
		                      
	}
        public static void chimpmunksParty(int cigars, boolean weekend) {
              if(cigars>=40 && cigars<=60 && weekend==false) {
            	  System.out.println("true");
              } else if(cigars>=40 && weekend==true) {
            	  System.out.println("true");
              }else {
            	  System.out.println("false");
              }
        	 		
         }

}
