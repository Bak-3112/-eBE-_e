class Prac
{
	int a;
	int b;
	
	public void test(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this);
	}
}

class Washingmachine
{
	
	String brand;
	Washingmachine(String brand)
	{
		System.out.println(brand);
	}
}
public class This 
{

	public static void main(String[] args) 
	{
		
		Prac p1=new Prac();
		p1.test(10,12);
		System.out.println(p1);
		
		Washingmachine w1=new Washingmachine("LG");
		System.out.println(w1.brand);

	}
		
}


