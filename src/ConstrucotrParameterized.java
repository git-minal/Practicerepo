
public class ConstrucotrParameterized {
	int a,b;//instance variable
	
	public ConstrucotrParameterized(int x, int y)
	{
		a=x;
		b=y;
		//System.out.println("Hello");
	}
	
	public void add()
	{
		int c=a+b;
		System.out.println("Addition :"+c);
	}
	public static void main(String[] args) {
		ConstrucotrParameterized obj = new ConstrucotrParameterized(10,10);
		obj.add();
		ConstrucotrParameterized obj1 = new ConstrucotrParameterized(30,50);
		obj1.add();
	}
}
