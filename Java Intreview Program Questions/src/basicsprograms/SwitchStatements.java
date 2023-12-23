package basicsprograms;
import java.util.Scanner;
public class SwitchStatements
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		switch (ch)
		{
		case 'a':
		{
			System.out.println("Viowel");
			break;
		}
		case 'e':
		{
			System.out.println("Viowel"); 
			break;
		}
		case 'i':
		{
			System.out.println("Viowel");
			break;
		}
		case 'o':
		{
			System.out.println("Viowel");
			break;
		}
		case 'u':
		{
			System.out.println("Viowel");
			break;
		}
		default:
		{
			System.out.println("Consonant");
			break;
		}
		}	
	}
}
