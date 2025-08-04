package OOP_LAB_02;
import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		char C;
		
		C = sc.next().charAt(0);
		
		if( C>=65 && C<=90 )
		{
			System.out.println("Character is an Alphabet!");
		}
		
		else if( C>=97 && C<=122 )
		{
			System.out.println("Character is an Alphabet!");
		}
		else
		{
			System.out.println("Character is not an Alphabet");
		}

	}

}
