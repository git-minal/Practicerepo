import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		Map< Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(10, "A");
		lhm.put(30, "H");
		lhm.put(91, "L");
		lhm.put(14, "A");
		for (Map.Entry<Integer, String> m : lhm.entrySet()) {
			System.out.println("Key "+m.getKey()+" Value "+m.getValue()+" ");
		}

	}

}
