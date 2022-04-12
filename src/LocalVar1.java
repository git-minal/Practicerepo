
public class LocalVar1
{
	//program for local,instance and static variable
	static int numstud=50;

 public void area()
 {
	 int a=5,b=5,c;
	 c= a*b;
	 System.out.println("The area of Square is :"+c);
 } 
 
 public void total()
 {
	numstud=numstud+1;
	System.out.println("The number of student are :"+numstud);
 }
 public static void main(String[] a)
 {
	// System.out.println("Area of Square :" +c);
	 //we cant find c here as it is local variable of area() method
	 LocalVar1 v= new LocalVar1(); 
	 //v is an instance variable
	 v.area();
	 v.total();
 }
} 