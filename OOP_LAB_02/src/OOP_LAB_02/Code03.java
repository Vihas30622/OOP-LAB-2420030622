package OOP_LAB_02;
import java.util.Scanner;

public class Code03 {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		int S=0;
		int R;
		
		while(num>0)
		{
			R=num%10;
			
			S=S+R;
			
			num=num/10;
		}
		
		System.out.println(S);
			
		

	}

}
