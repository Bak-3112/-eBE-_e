
public class Multithreading 
{

	public static void main(String[] args) throws Exception
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("MAC");
				try{Thread.sleep(1000);} catch(Exception e){}
			}
	});
		Thread t2=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Windows");
				try{Thread.sleep(1000);} catch(Exception e){}
			}
		
	});
		
		t2.setPriority(10);
		
		t1.start();
		try{Thread.sleep(10);} catch(Exception e){}
		t2.start();
		
		
	
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}
}
