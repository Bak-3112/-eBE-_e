class Counter
{
	int count;	
	
	public synchronized void increment()
	{
		count++;
	}
}

public class Synchronized {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
		Counter c=new Counter();
		
		Thread t1=new Thread(new Runnable()
				{
					public void run() {
							
						for(int i=1;i<=1000;i++)
						{
									c.increment();
						}
					}
					
				});
		
		Thread t2=new Thread(new Runnable()
		{
			public void run() {
					
				for(int i=1;i<=2000;i++)
				{
							c.increment();
				}
			}
			
		});
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println(t1.isDaemon());
		System.out.println(t2.isInterrupted());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(c.count);
	}
}
