
public class EvenNumAdd {
	//Addition of Even numbers
	public static void main(String[] args)
	{
    // int num=1;
     int sum=0;
	System.out.println("The even numbers are....");
		for(int num=1;num<=20;num++)	
		{		
			if(num%2==0)
			{
			System.out.println(num);
			sum=sum+num;
			}				
		}
		System.out.println("The Addition of Even numbers is==>" +sum);
	}
   
}
