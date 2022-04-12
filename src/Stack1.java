import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		List<String> st=new Stack<>();
		st.add("A");
		st.add("B");
		st.add("C");
		st.add("D");
		//st.pop();//LIFO
		Iterator<String> itr= st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
