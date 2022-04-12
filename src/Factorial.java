import java.util.Scanner;

public class Factorial 
{
	int num;
	int factnum=1;
	public void fact()
	{
		System.out.println("Enter the number :");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			factnum=factnum*i;		
		}
		System.out.println("Factorial of number is : " +factnum);
	}
	
	public static void main(String[] args)
	{
	   Factorial obj = new Factorial();
		
	
		obj.fact();
		
	}
}
