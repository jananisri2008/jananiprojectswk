package basicsprograms;
//Logical Operators----> AND &&, OR ||, NOT !

public class LogicalOperators
{
	public static void main(String[] args)
	{
		int a=10,b=20;
		//AND
		boolean res1=(a<b && a>b);
		System.out.println("AND:"+res1);
		//OR
		boolean res2=(a<b || a>b);
		System.out.println("OR:"+res2);
		//NOT
		boolean res3=!(a==b);
		System.out.println("NOT:"+res3);		
	}
}
