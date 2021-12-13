class Cricavg
{
	double batavg;
	double bowlavg;
	
	public Cricavg(double baa,double boa)
	{
		batavg=baa;
		bowlavg=boa;
		if(batavg>=56.66)
		{
			System.out.println("Rohit sharma");
		}
		else if(bowlavg<=5.2)
		{
			System.out.println("Jadeja");
		}
		else
		{
			System.out.println("No one is selected");
		}
	}
}
class Mobile
{
	String mobilename;
	int mobileprice;
	
	
	public Mobile()
	{
		System.out.println("No arg constructor");
	}
	public Mobile(String mname,int mprice)
	{
		mobilename=mname;
		mobileprice=mprice;
		System.out.println("Parameterized constructor");
	}
}
public class Constructor 
{
	public static void main(String[] args)
	{
		Mobile cons=new Mobile("iPhone",49999);
		System.out.println(cons.mobilename);
		System.out.println(cons.mobileprice);
	
		System.out.println("------------------------------------");
		
		Cricavg avg=new Cricavg(51.2,4.1);
		System.out.println(avg.batavg);
		System.out.println(avg.bowlavg);
	
	}
}




