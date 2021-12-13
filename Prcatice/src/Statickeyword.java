class Student
{
	int srollno;
	String sname;
	static String sclassteacher;
	
	static
	{
		sclassteacher="NAVIN";
		System.out.println("Static block");
	}
	Student()
	{
		srollno=1;
		sname="Teju";
		//sclassteacher="James";
		System.out.println("Constructor block");
	}
	
	void Show()
	{
		System.out.println(srollno + "  "+sname +" "+sclassteacher +" ");
	}
}


public class Statickeyword {
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.Show();
		
		Student s2=new Student();
		s2.sname="Niths";
		s2.srollno=2;
		s2.Show();
		
	}
}
