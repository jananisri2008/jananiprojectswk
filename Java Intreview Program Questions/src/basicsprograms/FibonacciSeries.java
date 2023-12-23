package basicsprograms;
//Fibonacci series--->Sum of previous two numbers
class FibonacciSeries
{
	public static void main(String[]args)
	{
		int n1=0,n2=1,n3,count=14;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}

