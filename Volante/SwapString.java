import java.util.*;

class SwapString
{	
	public static void main(String args[])
	{
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the String");
    
        String S1 = myObj.nextLine();    
        String S2 = myObj.nextLine();
		
		System.out.println("Strings before swap: S1 = " + S1 + " and S2 = " + S2);
		
		S1 = S1 + S2;
		
		S2 = S1.substring(0,S1.length()-S2.length());
		
		S1 = S2.substring(S2.length());
		
		System.out.println("Strings after swap: S1 = " + S1 + " and S2 = " + S2);
        myObj.close();		
	}	
}
