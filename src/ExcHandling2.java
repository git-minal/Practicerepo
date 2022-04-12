
public class ExcHandling2 {

	public static void main(String[] args) {
		try
		{
			int d=10/0;
			//System.out.println("this is try block");
		}
		catch (Exception e)
		{
			System.out.println("this is catch block using parant class exception");
		}
		System.out.println("Rest of program");
	}

}
