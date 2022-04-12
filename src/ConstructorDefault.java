
public class ConstructorDefault {
	public void ConstructorDefault()
	{
		System.out.println("Hello");
	}
	
	public void add(int a,int b)
	{
		System.out.println("Addition :"+(a+b));
	}
	public static void main(String[] args) {
		ConstructorDefault obj = new ConstructorDefault();
		obj.add(10, 10);
		

	}

}
