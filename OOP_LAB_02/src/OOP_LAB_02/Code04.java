package OOP_LAB_02;
import java.util.Scanner;

public class Code04 {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num1;
		int Num2;
		int i;
		int Max = 0;
		
		Num1 = sc.nextInt();
		Num2 = sc.nextInt();
		
	    for(i=1;i<=Num2;i++)
	    {
	    	if(Num1%i==0 && Num2%i==0)
	    	{
	    		if(i>=Max)
	    		{
	    			Max = i;
	    		}
	    	}
	    }
	    
	    System.out.println("The GCD of " + Num1 + " And " + Num2 + " is " + Max);
		
	}

}
