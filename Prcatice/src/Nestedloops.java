
public class Nestedloops 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j +" ");
			}	
			System.out.println();
		}
		
		
		
		
		for(int l=1;l<=5;l++)
		{
			for(int k=1;k<=l;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();	
		}
	
		
		
		for(int d=0;d<=3;d++)
		{
			int f=65;
			for(int e=0;e<=d;e++) 
			{
				System.out.print((char)(f+d)+ " ");
			}
			System.out.println();
		}
	}
}
