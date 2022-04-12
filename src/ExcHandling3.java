
public class ExcHandling3 {

	public static void main(String[] args) {
		int div=10;
		int i=0;
		int result;
		try
{
			result=div/i;
}
		catch (ArithmeticException ae) {
			//System.out.println();
			//ae.getMessage()
			System.out.println("In catch block");
			System.out.println(div/(i+2));
		}
		System.out.println("rest of program");
	}

}
