import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		Map<Integer,String> mp=new TreeMap<>();
		mp.put(20,"cccc");
		mp.put(90,"oooo");
		mp.put(10,"llll");
		for (Map.Entry<Integer,String> me : mp.entrySet()) {
			System.out.println("key :"+me.getKey()+"value :"+me.getValue());
		}

	}

}
