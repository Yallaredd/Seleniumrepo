import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapProblems {

	public static void main(String[] args) {

		// Creatin HashMap
		//Map<Integer,String> map=new HashMap<Integer,String>();
		
		//Creating LinkedHashMap
	//	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		
		//Creating TreeMap
		Map<Integer,String> map=new TreeMap<Integer,String>();

		map.put(70, "Ten");
		map.put(20, "Twenty");

		map.put(30, "Thirty");

		map.put(110, "fourty");

		map.put(50, "fifty");

		map.put(60, "sixty");
		
				Set<Integer> keys=map.keySet();//keyset method returns all keys as a set
				for(Integer k:keys)
				{
					String v=map.get(k);
					System.out.println(k+"--->"+v);
				}
		

		
	}

}
