import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		
			Set<String> lh= new LinkedHashSet<>();
			lh.add("P");
			lh.add("Q");
			lh.add("R");
			lh.add("P");
			lh.add("");
			lh.add("");
			
			Iterator<String> itr=lh.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());

	}
}
