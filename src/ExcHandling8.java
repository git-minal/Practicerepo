
public class ExcHandling8 {

	public static void main(String[] args)
	{
	
try {
	int div=10/0;
}
//finally
//{
//	System.out.println("Finally");
//}
 catch (ArithmeticException a) 
{
	System.out.println("catch");	
}

	}

}
