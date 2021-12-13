import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Collectiondemo {

	public static void main(String[] args) {

		Collection obj = new ArrayList();
		obj.add(1);
		obj.add(3);
		
		
		Iterator<E> it= obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
