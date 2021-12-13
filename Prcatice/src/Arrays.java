class Mobilephones
{
	public void names()
	{
		String brands[][]= {
							{"APPLE","Samsung","Sony","Oppo"},
							{"Vivo","MI","Micromax","Xiomi","Huawei"},
							{"One+","LG","Google"}
		};
		for(String i[]: brands)
		{
			for(String j: i)
			{
			System.out.print(" "+ j + " ");
			}
			System.out.println();
		}
	}
}

public class Arrays {

	public static void main(String[] args) {
		
		String cars[] = {"BMW","BENZ", "AUDI", "JAGUAR"};
		
		String bikes[][] = {
								{"Benelli","BMW","TVS"},
								{"Hero","KTM","Vespa"},
								{"RE","JAWA","Bajaj"}
							};
		
		
		for(String j: cars)
		{
			System.out.print(" " + j);
		}
		System.out.println();
		
		for(String i[] : bikes)
		{
			for(String l : i)
			{
				System.out.print(" " + l);
			}
			System.out.println();
		}
		
		
		Mobilephones m1 = new Mobilephones();
		m1.names();		
		
	}

}
