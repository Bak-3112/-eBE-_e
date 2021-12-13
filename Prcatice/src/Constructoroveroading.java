class Stopwatch
{
	int time;
	public Stopwatch()
	{
		System.out.println("No arg");
	}
	public Stopwatch(int i)
	{
		time=i;
		System.out.println(time);
		System.out.println("Passing arg");
	}
}
public class Constructoroveroading {

	public static void main(String[] args)
	{
		Stopwatch s1=new Stopwatch();
		Stopwatch s2=new Stopwatch(5);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}