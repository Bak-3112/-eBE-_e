class Bluetooth
{
	public void status(String s,String a)
	{
		if(s=="ON")
		{
			System.out.println("Bluetooth is turned on");
		}
		else
		{
			System.out.println("Bluetooth is off");
		}
	}
	public void status(String s,String a,int b)
	{
		if(s=="ON")
		{
			System.out.println("Bluetooth is turned on");
		}
		else if(a=="OFF")
		{
			System.out.println("Bluetooth is off");
		}
		else if(b==68)
		{
			System.out.println("Battery percentage is : "+ b);
		}
		else
		{
			System.out.println("You don't have a bluetooth");
		}
	}
	
}



class Markscard
{
	public void percentage(int p,int c,double m)
	{
		double percentage;
		percentage=((p+c+m)/300)*100;
		Double s1=percentage;
		System.out.println("percentage of student1 for PCM =" + s1);
	}
	public void percentage(int p,int c,double m,float b)
	{
		double percentage;
		percentage=((p+c+m+b)/400)*100;
		Double s2=percentage;
		System.out.println("percentage of student2 PCMB =" + s2);
	}
	public void compare(double s1,double s2)
	{
		if(s1>=s2)
		{
			System.out.println("Student 1 performed well");
		}
		else
		{
			System.out.println("Student 2 performed well");
		}
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
		
		Bluetooth b1=new Bluetooth();
		b1.status("ON","Null");
		b1.status("ON", "OFF", 29);
		
		
		Markscard m=new Markscard();
		m.percentage(63, 79, 35.5);
		m.percentage(92, 89, 73.5, 99.5f);
		m.compare(59.16,88.5);
	}

}
