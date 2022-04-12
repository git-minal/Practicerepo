
public class ExcHandling7 {
		public static void main(String[] args) {		
	try {
		int div=10/0;		
		}
	catch (ArithmeticException e) {
		System.out.println("Catch");
	}
	finally
	{
		System.out.println("Finally");
	}
		}
	

}
