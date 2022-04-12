import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
public static void main(String[] args)
{
	List<String> l1= new ArrayList<>();
	l1.add("Meenal");
	l1.add("Mahesh");
	l1.add("Meenal");  
	System.out.println("second value :" +l1.get(1));
	Iterator<String> itr=l1.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	 	
}
}
