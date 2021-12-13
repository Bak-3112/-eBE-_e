interface ABC
{
	void show();
}

class D implements ABC
{

	@Override
	public void show() {

		for(int i=0;i<5;i++)
		{
			System.out.println("Show from Class D");
		}
	}
	
}
class F implements ABC
{

	@Override
	public void show() {
		
		System.out.println("F class");
	}
	
}
class E extends D
{

	public void display(ABC g) {
		
		g.show();
		
	}
	
}

class H extends F
{
	public void display(ABC i) {
		
		i.show();
		
	}
}
public class Interface {

	public static void main(String[] args) {

//		ABC obj= new D();
		ABC obj1= new E();
//		ABC obj2= new F();
//		obj2.show();
//		obj.show();
		obj1.show();
		
		
		H h1=new H();
		h1.show();
	}

}
