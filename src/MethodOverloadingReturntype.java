
public class MethodOverloadingReturntype 
{
	//public int sum(int a,int b)
//	{
//		int c=a+b;
//		System.out.println("Addition(first method) : "+c);
//	}
//	public void sum(int a, int b)
//	{
//		int c=a+b;
//		System.out.println("Addition(second method) : "+c);
//	}
	public static void main(String[] args)
	{
		MethodOverloadingReturntype obj = new MethodOverloadingReturntype();
	//	obj.sum(10, 0);//compile error as change in Return type is not accessible
		//compiler goes to check only parameters
	}
}
