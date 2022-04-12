class MyExc extends Exception
{
	public MyExc(String msg)
	{
		super(msg);
	}
}
public class ExcHandling12 {

	public static void main(String[] args) 
	{
		int loginattempt=4;
	
		 if (loginattempt>3) 
				try {
					throw new MyExc("account blocked");
				    }	 
				catch(MyExc e)
		 		{
				e.printStackTrace();
		 		}   
		 else 
				System.out.println("login successful");
			
	} 
}