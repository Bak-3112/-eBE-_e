import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapinterface {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Arun");
		map.put(2, "Kiran");
		map.put(3, "Varjun");
		
		
		
		
		
		Set<Integer> keys= map.keySet();
		
		for(Integer key : keys)
		{
			System.out.println(map.get(key));
		}
		
		
	}

}
