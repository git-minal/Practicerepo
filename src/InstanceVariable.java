
public class InstanceVariable {
	int c;
	public void addition()
	{
		int a=10;
		int b=30;
		c=a+b;
		System.out.println("Addition is=" +c);
	}
	public void subtraction()
	{
		int x=20;
		int y=10;
		int z=x-y;
		System.out.println("Subtraction is=" +z);
	}
	
	
	public static void main(String[] args) {
		InstanceVariable iv1=new InstanceVariable();
		iv1.c=100;
		System.out.println("instance variable value is="+iv1.c);
		//iv1.addition();
		//iv1.subtraction();
		InstanceVariable iv2=new InstanceVariable();
		iv2.c=200;
		System.out.println("instance variable value is="+iv2.c);
	}

}
