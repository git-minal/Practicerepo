
public class ExcHandling5 {

	public static void main(String[] args)
	{
		try {
		int a[]=new int[5];
		a[6]=10;
		int div=10/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception");
		}
		catch (ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Array index Exception :" +ar.getMessage());
		}
	}

}
