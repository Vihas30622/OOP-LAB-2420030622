package OOP_LAB_3;
import java.util.Scanner;

public class Code_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S1;
		String S2;
		int i;
		int j;
		int count = 0;
		char temp;
		
		S1 = sc.next();
		S2 = sc.next();
		
		S1 = S1.toLowerCase();
		S2 = S2.toLowerCase();
		
		char a1[] = S1.toCharArray();
		char a2[] = S2.toCharArray();
		
		if(S1.length()==S2.length())
		{
			for(i=0;i<S1.length();i++)
			{
				for(j=0;j<S1.length();j++)
				{
					if(a1[i]<a1[j])
					{
						temp=a1[j];
						a1[j]=a1[i];
						a1[i]=temp;
					}
				}
				
			}
			
			
			for(i=0;i<S1.length();i++)
			{
				for(j=0;j<S1.length();j++)
				{
					if(a2[i]<a2[j])
					{
						temp=a2[j];
						a2[j]=a2[i];
						a2[i]=temp;
					}
				}
				
			}

		}
		else
		{
			System.out.println("Not an Anagram");
		}	
		
		for(i=0;i<S2.length();i++)
		{
			if(a1[i]==a2[i])
				count=count+1;
			
			else
				break;
		}
		
		if(count==S1.length())
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");
	}

}
