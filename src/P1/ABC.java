package P1;

public class ABC {
	private int a=20;
	int b=10;
	private void display()
	{
		System.out.println("This is Display Method from Class ABC");
	}
	public void print()
	{
		System.out.println("This is print Method from Class ABC");
	}
	public static void main(String[] args)
	{
		System.out.println("This is Java main Method from Class ABC");
		ABC obj =new ABC();
		obj.display();
		System.out.println("private intger " +obj.a);
		System.out.println("default intger " +obj.b);
		
		
	}

}
