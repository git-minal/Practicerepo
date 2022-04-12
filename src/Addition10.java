
public class Addition10 {
	public static void main(String[] args) {
		//Addition of 10 numbers using While loop
		
		 /* int num=1; 
		  int add=0;*/
			/*
			 * while(num<=10) { add=add+num; System.out.println(num); num=num+1; }
			 */
			
			//Addition using do while
			
			/*
			 * do { System.out.println(num); add=add+num; num=num+1; } while(num<=10);
			 */
			int add=0;
			 for(int num=1;num<=10;num++) 
			 {
				 System.out.println(num);
				 add=add+num;	 
			 }
	  System.out.println("Addition of 10 numbers is-->" +add);
	}
}
