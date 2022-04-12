import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector1 {
public static void main(String args)
{
	List<String> v1=new Vector<>();
	v1.add("A");
	v1.add("S");
	Iterator<String> itr=v1.iterator();
	while(itr.hasNext())
			{
		System.out.println(itr.next());
			}
	
	}
}
