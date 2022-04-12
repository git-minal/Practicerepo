
public class ExcHandling6 {
	public static void main (String[] args)
	{
	try {
		try {
			System.out.println("Inner try block");
			int div=10/0;
		} catch (ArithmeticException ae) {
			System.out.println("Inner try arithmatic exception");
		}
		try {
			int a[]=new int [4];
			a[5]=21;
			System.out.println("Inner second try block");
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("Inner second catch array out of bound exception");
		}
		
	} catch (Exception e) {
		System.out.println("Outer exception");
	}

}

}
