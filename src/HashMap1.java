import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(10, "A");
		hm.put(30, "H");
		hm.put(91, "L");
		hm.put(14, "A");

		for(Map.Entry<Integer, String> m:hm.entrySet())
		{
			System.out.println("Key "+m.getKey()+" Value "+m.getValue()+" ");
		}
	}

}
