
public class JaggedARray {

	public static void main(String[] args) {

		
		int s1[][]= {{1,2,3,4},{5,6,7},{8,9,5,7}};
		
		
		for(int i[]:s1)
		{
			for(int l:i)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
