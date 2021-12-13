class Bottle implements Runnable
{
	int watercapacity;
	int price;
	String brand;
	public void bottlecheck(int i,String s)
	{
		price=i;
		brand=s;
		while(price<30)
		{
			if(brand=="Tupperware")
			{
				System.out.println("Water capacity is 1 litre " + brand);
			}
			else
			{
				System.out.println("Water capacity is more or less than 1 litre " + brand);
			}
			break;
		}
	}
	@Override
	public void run() {
		System.out.println("Bottle class Run method ");		
	}
}
class Stand implements Runnable
{
	int laddersize;
	public void laddercheck(int j)
	{
		laddersize=j;
		switch(j)
		{
			case 10:
				System.out.println("ladder is too small  " + laddersize);
				break;
			case 20:
				System.out.println("ladder is medium  " + laddersize);
				break;
			case 30:
				System.out.println("ladder height is almost 20ft  " + laddersize);
				break;
			default:
				System.out.println("ladder height is more than 20ft  " + laddersize);
				break;
		}	
	}
	@Override
	public void run() {
		System.out.println("Stand class run method");				
	}
}
public class ThreadingusingInterfaceandthreads {
	public static void main(String[] args) {
		
		Runnable b1=new Bottle();
		Runnable l1=new Stand();
		
		Bottle b2=new Bottle();
		b2.bottlecheck(20, "Bisleri");
		
		Stand s1=new Stand();
		s1.laddercheck(10);
		
		Thread t1=new Thread(b1);
		Thread t2=new Thread(l1);
		
		t1.start();
		t2.start();

	
	}

}

