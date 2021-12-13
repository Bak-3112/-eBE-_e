class A1
{
	void show()
	{
		System.out.println("In A1 show");
	}
}

class B2 extends A1
{
	void show()
	{
		//super.show();
		System.out.println("In B2 show");
	}
	void select()
	{
		System.out.println("In select B2");
	}
}

class C2 extends A1
{
	void show()
	{
		super.show();
		System.out.println("In C2 show");
	}
	void select()
	{
		System.out.println("In select C2");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		
		A1 obj=new B2();
		obj.show();
		//((B2) obj).select();
		
		obj=new C2();
		obj.show();
		
		((C2) obj).select();
	}

}
