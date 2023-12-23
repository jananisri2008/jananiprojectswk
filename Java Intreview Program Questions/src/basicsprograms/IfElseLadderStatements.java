package basicsprograms;
import java.util.Scanner;
public class IfElseLadderStatements
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Marks ");
		int mark=sc.nextInt();

		if(mark>90)
		{
			System.out.println("O Grade");
		}
		else if(mark<=90 && mark>80)
		{
			System.out.println("A Grade");
		}
		else if(mark<=80 && mark>70)
		{
			System.out.println("B Grade");
		}
		else if(mark<=70 && mark>60)
		{
			System.out.println("C Grade");
		}
		else if(mark<=60 && mark>50)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
