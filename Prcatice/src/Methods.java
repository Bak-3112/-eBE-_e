//no argument method
class Laptop
{
	public void hpworld() 
	{
		int distance=2;
		System.out.println("Welcome to HP WORLD");
		System.out.println("----------------------");
		if(distance==3)
		{
			System.out.println("Shop is near");
		}
		else
		{
			System.out.println("Shop is too far");
		}
	}
}

// parameter passing method 
class TT
{
	void play(String playername,int numberofmatches)
	{
		System.out.println("===================================");
		System.out.println("Game played by ="+ playername);
		System.out.println("Matches yet to be played ="+ numberofmatches);
		points();
	}
	void points()
	{
		System.out.println("***********************************");
		System.out.println("Set1--21-12");
		System.out.println("Set2--21-07");
		System.out.println("Set3--13-21");
		System.out.println("Set4--18-21");
		System.out.println("Set5--21-19");
	}
}


public class Methods {

	public static void main(String[] args)
	{
		Laptop l1= new Laptop();
		l1.hpworld();
		
		TT play=new TT();
		play.play("gonsifakai", 5);
		
	}
}
