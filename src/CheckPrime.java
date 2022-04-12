//Write pgm to check given number is prime or not
public class CheckPrime
{  		
	public static void main(String[] args) 
		{
			
		int num=33,flag=0;		
			for(int i=2;i<=num;i++)
			{
				if(num%2==0) 
				{
					flag=1;
					break;		
				}	
			}		
		if(flag==0)
		{
			System.out.println(num+ " is prime number");
		}
		else 
			System.out.println(num+" is not prime number");
			
		}
}
