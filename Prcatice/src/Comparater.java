import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparater {

	public static void main(String[] args) {

		List<Integer> val=new ArrayList<Integer>();
		val.add(1);
		val.add(9);
		val.add(2);
		val.add(6);
				
		//Collections.sort(val, (i,j)-> i%10>j%10?1:-1);	
		
		Collections.reverse(val);
		
		for(Integer o:val)
		{
			System.out.println(o);
		}
	}
}
