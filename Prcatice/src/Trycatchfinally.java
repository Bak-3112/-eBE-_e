
public class Trycatchfinally {

	public static void main(String[] args) {

		int i=10;
		int j=2;
		int res=i/j;
		System.out.println(res);
		
		try
		{
			System.out.println("Arithmatic Operator");
		}
		catch(Exception e)
		{
			System.out.println("Error...");
		}
		finally
		{
			System.out.println("End of catch");
		}
		
		
	}

}
