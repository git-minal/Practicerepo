
public class MethodOverloadingDatatype 
{
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition(first method) : "+c);
	}
	public void sum(float a, int b)
	{
		float c=a+b;
		System.out.println("Addition(second method) : "+c);
	}
	public static void main(String[] args) {
MethodOverloadingDatatype obj = new MethodOverloadingDatatype();
obj.sum(10, 50);
obj.sum(10.5f, 20);

	}

}
