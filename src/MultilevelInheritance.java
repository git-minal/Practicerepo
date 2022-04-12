//Write java pgm to implement multi level inheritance
class A
{
	public void display()
	{
		System.out.println("*****Result of Student*****");
	} 
}
class B extends A
{
	int x=20,y=40,z=20;
	public void Subj_marks()
	{
		
		System.out.println("Marks obtained in English : "+x);
		System.out.println("Marks obtained in Maths : "+y);
		System.out.println("Marks obtained in Marathi : "+z);
	}
}
class C extends B
{
	public void total_marks()
	{
		int t=0;
		t=x+y+z;
		System.out.println("Total of Marks is : "+t);
	}
}
public class MultilevelInheritance
{

	public static void main(String[] args)
	{
		C obj1=new C();
		obj1.display();
		obj1.Subj_marks();
		obj1.total_marks();
	}
}
