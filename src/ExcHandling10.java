

public class ExcHandling10 {

public void m()
{
	int data=10/0;
}
public void n()
{
	m();
}
public void p()
{
	try {
	n();
	} 
	catch (ArithmeticException e) {
		System.out.println("Exception caught");
	}
}
	public static void main(String[] args) {
		
ExcHandling10 obj=new ExcHandling10();
obj.p();
	}

}
