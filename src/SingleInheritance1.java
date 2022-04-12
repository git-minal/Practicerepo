// Write java pgm to implement Single level inheritance 
class StudentMarks
{
	public void result()
	{
	 int smarks=60;
	 if(smarks>=30)
	 {
		 System.out.println("**** The Result is Pass ****");
	 }
	 else
		 System.out.println("**** The Result is Fail ****");
	}
}
	
class StudentChild extends StudentMarks
{
 
}

public class SingleInheritance1  
{
	public static void main(String[] args)
	{	
	System.out.println("Display of Student Result");
	StudentMarks obj=new StudentChild();
	obj.result();
	}
}
