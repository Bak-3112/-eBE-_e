class Address
{
	String add;
	public void disp()
	{
		System.out.print("Gandinagar"+" ");
	}
	class City
	{
		public void show()
		{
			System.out.print("Bellary"+ " ");
		}
	}
	static class Houseno
	{
		public static void num()
		{
			System.out.print("LIG 331"+ " ");
		}
	}
}
public class Innerclass {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Address a1=new Address(); // Outer class object creation
		
		Address.City c1=a1.new City(); // Inner non-static class object creation
		c1.show();
		a1.disp();
		
		Address.Houseno h1=new Address.Houseno(); //Inner static class object creation
		h1.num();
		
	}

}
