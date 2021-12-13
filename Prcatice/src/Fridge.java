class Fridgerunner
{
	String fbrand="MI";
	
	Fridgerunner(String fbrand)
	{
//		System.out.println(this);
//		System.out.println(fbrand);
//		System.out.println(this.fbrand);
		this.fbrand=fbrand;
//		String name=this.fbrand;
//		System.out.println(name);
	}
	
	
}
public class Fridge {

	public static void main(String[] args)
	{
		Fridgerunner f1=new Fridgerunner("NOVA");
		//System.out.println(f1);
		System.out.println(f1.fbrand);
	}
}
