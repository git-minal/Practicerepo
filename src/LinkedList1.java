import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<String> ls=new LinkedList<>();
		ls.add("L");
		ls.add("M");
		ls.add("N");
		ls.add("L");
		Iterator<String> itr= ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
