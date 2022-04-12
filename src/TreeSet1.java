import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<>();
		ts.add("P");
		ts.add("A");
		ts.add("R");
		ts.add("D");
		//lh.add("");
		//lh.add("");
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
