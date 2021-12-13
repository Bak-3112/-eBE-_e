interface Mac
{
	void mfeatures();
	
	default void showconf()
	{
		System.out.println("In Mac showconf");
	}
}

interface Windows
{
	default void showconf()
	{
		System.out.println("In Windows showconf");
	}
}

class Os implements Mac,Windows
{

	@Override
	public void showconf() {
		// TODO Auto-generated method stub
		Windows.super.showconf();
	}

	@Override
	public void mfeatures() {

		System.out.println("MAC AIR");
		
	}
	

	
}



public class MultipleInheritanceusingInterface {

	public static void main(String[] args) {
		
		Os o1= new Os();
		o1.showconf();
		o1.mfeatures();

	}

}
