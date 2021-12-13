class Pods
{
	int battery;
	public void working()
	{
		if(battery==100)
		{
			System.out.println("Battery full");
		}
		else
			if(battery<=80 && battery>=30)
			{
				System.out.println("Battery is normal");
			}
		else
		{
			System.out.println("low battery");
		}
	}
	
}
class Bakery 
{
	int numberofitems;
	String itemname;
	
	public Bakery(int n,String name)
	{	
		numberofitems=n;
		itemname=name;
	}
}



class Calc
{
	int num1=10;
	int num2=2;
	
	public void add()
	{
		 int result=num1+num2;
		 System.out.println(result);
	}
	
}
	
public class Objects 
{

	public static void main(String[] args) 
	{
		Pods batt=new Pods();
		batt.battery=20;
		batt.working();
	
		Bakery b1=new Bakery(5,"Puff");
		System.out.println("========================");
		System.out.println(b1.itemname);
		System.out.println(b1.numberofitems);
		
		Calc res=new Calc();
		res.add();
		
	}
}
