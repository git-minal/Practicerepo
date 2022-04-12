package P2;
import P1.ABC;
public class XYZ extends ABC
{

	public static void main(String[] args)
	{
		System.out.println("This is main Method from Class XYZ");
		XYZ obj = new XYZ();
		//obj.display();// compile error
		obj.print();
	}

}
