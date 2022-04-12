
public class ExcHandling9 {

	public static void main(String[] args) {
		try {
			try
			{	
				int div=10/0;
			}
			catch(ArrayIndexOutOfBoundsException ar) 
			{
				System.out.println("array out of bound 1 exception");
			}
			try
			{
				int a[]=new int [4];
				a[5]=21;
				}
			catch (ArrayIndexOutOfBoundsException ar) 
			{
				System.out.println("array out of bound 2 exception");
			}
			
		}
		catch (Exception e) 
		{
			System.out.println("Outer exception");
		}
	}
}
