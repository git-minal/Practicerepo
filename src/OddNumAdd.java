
public class OddNumAdd {
	//Addition of odd numbers
		public static void main(String[] args)
		{
	     int sum=0;
		 System.out.println("The odd numbers are....");
			for(int num=1;num<=20;num++)	
			{		
				if(num%2!=0)
				{
					System.out.println(num);
					sum=sum+num;
				}			
			}	
		System.out.println("The Addition of Odd numbers is==>" +sum);
		}
}


