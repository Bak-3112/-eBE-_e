import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setineterface {
	
	public static void main(String[] args)

	{
		Set<Integer> val=new TreeSet<>();
		val.add(52);
		val.add(71);
		val.add(94);
		val.add(45);
		
		for(int i : val)
		{
		System.out.println(i);
		}
	}
}