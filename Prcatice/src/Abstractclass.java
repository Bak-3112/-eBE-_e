

abstract class Human
{
	public abstract void eat();
	public void workout()
	{
		System.out.println("In workout Human");
	}
}

class Man extends Human
{
	public void eat()
	{
		System.out.println("In Man eat");
	}
}


public class Abstractclass {

	public static void main(String[] args) {

		
		
		Man m1=new Man();
		m1.workout();
	}

}
