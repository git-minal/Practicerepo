
public class Pyramid2 {
/* Display
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1    	*/
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--) //rows
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
