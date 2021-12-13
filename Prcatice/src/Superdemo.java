class A
{
	A()
	{
		System.out.println("No Arg Constructor in A");
	}
	A(int i)
	{
		System.out.println("Parameterised constructor of A="+ i);
	}
}
class B extends A
{

	B()
	{
		super();
		System.out.println("No Arg Constructor in B");
	}
	B(int i)
	{
		super(i);
		System.out.println("Parameterised constructor of B=" + i);
	}
}

public class Superdemo {

	public static void main(String[] args) {
	
		B obj=new B(5);
	}

}
