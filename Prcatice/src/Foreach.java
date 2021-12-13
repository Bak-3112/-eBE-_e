class Colors
{
	Colors()
	{
		String[][] holy= {{"Red","Green","Yellow","All Black"},{"White","Blue","Orange","Pink"},{"Brown","Silver"}};

		for (String s1[]: holy)
		{
			for(String s2: s1)
			{
				System.out.print(" " + s2 +" ");
			}
			System.out.println();
		}
	
	
}
}

public class Foreach {

	public static void main(String[] args)
	{
		
		@SuppressWarnings("unused")
		Colors c1=new Colors();
		
	}

}

