import java.util.Iterator;
import java.util.PriorityQueue;

public class PriQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("A");
		pq.add("B");
		pq.add("C");
		System.out.println(pq.element());
		System.out.println(pq.peek());
		pq.remove();//FIFO
		
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
 