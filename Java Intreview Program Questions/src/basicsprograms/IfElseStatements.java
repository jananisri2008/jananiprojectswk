package basicsprograms;
import java.util.Scanner;
public class IfElseStatements 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the value ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("even no"+num);
		}
		else
		{
			System.out.println("ood no"+num);
		}
	}
}
