 class MethodOverridingParent
{
	public void display() {
		System.out.println("Hello");
	}
}
 class MethodOevrridingChild extends MethodOverridingParent
{
	public void display()
	{
		System.out.println("This is java pgm");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
	MethodOverridingParent obj = new MethodOevrridingChild();
	obj.display();
	}

}
