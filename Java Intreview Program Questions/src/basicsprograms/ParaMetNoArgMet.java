package basicsprograms;

public class ParaMetNoArgMet
{
	 int sum(int x,int y)
	{
		return x+y;
	}
	public static  void main(String[]args)
	{
		int a=10,b=20;
		ParaMetNoArgMet obj=new ParaMetNoArgMet();
		int c=obj.sum(a,b);
		System.out.println("Result:"+c);
	}

}
