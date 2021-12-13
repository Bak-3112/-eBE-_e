class Student1
{
	public int sub(int c, int d)
	{
		return c-d;
	}
}
class Teacher extends Student1
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
class Hm extends Teacher
{
	public double div(double g,double h)
	{
		return g/h;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Hm h1=new Hm();
		int res1=h1.add(9, 4);
		int res2=h1.sub(12, 3);
		double res3=h1.div(12.5, 2.3);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
