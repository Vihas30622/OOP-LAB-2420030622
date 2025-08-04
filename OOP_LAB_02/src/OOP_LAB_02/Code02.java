package OOP_LAB_02;
import java.util.Scanner;
public class Code02 {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		char C;
		
		C =sc.next().charAt(0);
		
		if(C=='a'||C=='e'||C=='i'||C=='o'||C=='u'||C=='A'||C=='E'||C=='I'||C=='O'||C=='U')
		{
			System.out.println("Aplhabet is a Vowel!");
		}
		else
		{
			System.out.println("Aplhabet is not a Vowel!");
		}
		

	}

}
