
//Write pgm to print alternate prime no from 1 to 20
public class PrimeAlternate1to20 
{
	public static void main(String[] args)
	{
			int num=20, flag=0;
			for(int i=2;i<=num;num++)
			{
					if(num%i==0) 
					{
						flag=1;
						break;		
					}	
					
				
			}
			if(flag==0)
			{
			System.out.println(num);
			}	
			
	}

}
