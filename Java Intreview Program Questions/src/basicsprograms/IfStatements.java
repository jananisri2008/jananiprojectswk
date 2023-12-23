package basicsprograms;
//If Statement-->Age
import java.util.Scanner;
public class IfStatements
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter your age ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Your are Eligible for Vote");
		}
	}

}
