
public class Pyramid5 
{
	/*4. Print following pattern
	 1 2 3   3 2 1
	 1 2	   2 1
	 1  	     1     */
	public static void main(String[] args)
	{
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			 System.out.print(j+" ");
			}
			
			System.out.println();
		}
		for(int i=1;i>=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
			 System.out.print(j+" ");
			}
			
			System.out.println();
		}	
	
	}
}
