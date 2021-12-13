interface Seqel
{
	void calc(int c,int d);
	
	default void disp()
	{
		System.out.println("Displaying res");
	}
}

interface Work
{
	default void person(int s)
	{
		int sal=s;
		if(sal>30000 && sal<70000)
		{
			System.out.println("Can sustain in Blore");
		}
		else if(sal>15000 && sal<=30000)
		{
			System.out.println("Fresher to Blore");
		}
		else if(sal>70000)
		{
			System.out.println("Can Marry and sustain");
		}
		else
		{
			System.out.println("Need to relocate from Blore to Hometown");
		}
	}
	
	void showcase();
}

class integration implements Seqel, Work
{

	@Override
	public void calc(int c,int d) {
		
		int a=c;
		int b=d;
		int res=a+b;
		System.out.println(res);
		
	}

	@Override
	public void showcase() {
			System.out.println("Displaying Show");
		}
	}


public class DefinemethodsinInterface {

	public static void main(String[] args) {
		
		Seqel s1= new integration();
		s1.disp();
		s1.calc(10, 12);
		
		Work w1= new integration();
		w1.showcase();
		w1.person(70000);
		
		
	}

}
