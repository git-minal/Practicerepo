//Write java pgm to implement hierarchical inheritance
class House
{
	public void display()
	{
		System.out.println("Welcome to our society");
	}
}
class OneBhk extends House
{
	public void display()
	{
		System.out.println("This is one bedroom flat");
	}
}
class TwoBhk extends House
{
	public void display()
	{
		System.out.println("This is two bedroom flat");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Our Society");
		
		TwoBhk obj1=new TwoBhk();
		obj1.display();
		OneBhk obj2=new OneBhk();
		obj2.display();

	}

}
