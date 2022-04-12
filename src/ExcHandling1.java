
public class ExcHandling1 {

	public static void main(String[] args) {
		System.out.println("Divide operation using try catch");
		try
		{
			int div=10/0;
			//System.out.println("try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("cannot divid by 0");
		}
		System.out.println("Remaining statement");
	}

}
