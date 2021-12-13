
public class BreakandContinue 
{

	public static void main(String[] args) 
	{	
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		
		for(int j=1;j<=10;j++)
		{
			if(j==9)
			{
				break;
			}
			System.out.println(j);
		}
		
		
	}

}
