import java.io.IOException;

public class ExcHandling11 {
	public void m() throws IOException
	{
		throw new IOException();
	}
	public void n() throws IOException
	{
		m();
	}
	public void p()
	
	{
		try { n();
		}catch(IOException ioe)
		{
			System.out.println("Exception caught");
		}	
	}
	public static void main(String[] args)
	{
	ExcHandling11 obj=new ExcHandling11();
	obj.p();
	}

}
