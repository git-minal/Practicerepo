
public class MethodOverloadingArg
{
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition(first method) : "+c);
	}
	public void sum(int a, int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition(second method) : "+d);
	}
public static void main(String[] args)
{
MethodOverloadingArg obj=new MethodOverloadingArg();
obj.sum(20, 40);
//obj.sum(10, 20, 50);
}
}
