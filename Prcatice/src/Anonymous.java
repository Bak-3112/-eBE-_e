interface BAK
{
	void disp();
}
public class Anonymous {

	public static void main(String[] args) {
		
		BAK obj=new BAK()
				{
					public void disp()
					{
						System.out.println("Anonymous class interface");
					}
				};
		
		obj.disp();
		
	//() -> System.out.println("Anonymous class interface");

	}

}
