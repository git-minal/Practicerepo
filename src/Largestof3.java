//Write pgm to find largest of three numbers
public class Largestof3
{
	
public static void main(String[] args)
{
	int a=33,b=28,c=98;
	System.out.println("The given numbers are :"+a+","+b+","+c);
	if(a>=b && a>=c)
	{
		System.out.println("The largest no is : "+a);
	}
	else
	{
		if(b>=a && b>=c)
		{
			System.out.println("The lagest no is : "+b);
		}
		else
			System.out.println("The largest no is : "+c);
	}

}
}