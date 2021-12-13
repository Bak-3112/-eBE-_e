
public class Operators {

	public static void main(String[] args) 
	{
		int a=10,b=5;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	
		int h=9;
		int i=10;
		
		//i += h;
		//System.out.println(i);
	
		h = ++i;
		System.out.println(h);
		System.out.println(i);
		
		//h = i++;
		//System.out.println(h);
		//System.out.println(i);
		
		
		//Ternary operator
				int m=3;
				int y=5;
				
				if(m>2)
					y=1;
				else
					y=2;
				System.out.println(y);
				
				
				
				y= m>2?9:10; // ternary operator
				System.out.println(y);
				
	}

}
