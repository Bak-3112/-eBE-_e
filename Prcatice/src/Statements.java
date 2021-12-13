
public class Statements 
{

	public static void main(String[] args) 
	{

		//if-else statements
		int n=30;
		
		if(n%2==0)
		{
			System.out.println("Digit is even");
		}
		else if (n==0)
		{
			System.out.println("Digit is Zero");
		}
		else
		{
			System.out.println("Digit is odd");
		}
		
		
		//switch statements
		//numbers
		int s=38;
		switch(s)
		{
		case 0:
			System.out.println("Digit is even");
			break;
		case 1: 
			System.out.println("Digit is odd");
			break;
			default:
				System.out.println("Digit not found");
		}
		
		//For character
		
			char f='F';
			
			switch(f)
			{
			case 'B':
				System.out.println("character did not match");
				break;
			case 'S':
				System.out.println("character not found");
				break;
			case 'F':
				System.out.println("character is not matched");
				break;
			default:
				System.out.println("character matched");
				break;
			}
		
		
		//For String
	
		String d="bhy";
		
		switch(d)
		{
		case "prd":
			System.out.println("String did not match");
			break;
		case "abc":
			System.out.println("String not found");
			break;
		case "bak":
			System.out.println("String matched");
			break;
		default:
			System.out.println("String was not provided");
			break;
		}
		
		//for float
		
//		float g=10.5f;
//		
//		switch(g)
//		{
//		case 'g':
//			System.out.println("String did not match");
//			break;
//		case 'a':
//			System.out.println("String not found");
//			break;
//		}
		
		//for double
		
//		double d1=13.789;
//		
//		switch(d1)
//		{
//			case 'g':
//				System.out.println("String did not match");
//				break;
//			case 'a':
//				System.out.println("String not found");
//				break;
//		}
		
	}
}
