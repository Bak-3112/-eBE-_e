import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listinterface {

	public static void main(String[] args) {

		List<Integer> obj1= new ArrayList<Integer>();
		obj1.add(12);
		obj1.add(1);
		obj1.add(11);
		obj1.add(10);
		obj1.add(5);
		//obj1.add(4, 7);
		
		Collections.sort(obj1);
		Collections.reverse(obj1);
		
		for(Integer o:obj1)
		{
			System.out.println(o);
		}

}
}