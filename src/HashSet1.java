import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
	Set<String> st= new HashSet<>();
	st.add("P");
	st.add("Q");
	st.add("R");
	st.add("P");
	st.add("");
	st.add("");
	
	Iterator<String> itr=st.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	}

}
