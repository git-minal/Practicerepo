
public class MethodOverloadingDatatypePromotion {
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition(first method) : "+c);
	}
	public void sum(long a, int b)
	{
		long c=a+b;
		System.out.println("Addition(second method) : "+c);
	}
	public static void main(String[] args) {
		
		MethodOverloadingDatatypePromotion obj = new MethodOverloadingDatatypePromotion();
		obj.sum(31233, 0);
	}

}
