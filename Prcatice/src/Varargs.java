//class Bottle
//{
//	public int size(int...i)
//	{
//		int bsize=0;
//		int total=0;
//		double percentage=0.0;
//		for(int f : i) 
//		{
//			
//			bsize= bsize + f;
//			System.out.println(bsize);
//			
//			total=total+bsize;
//			System.out.println(total);
//			
//			percentage=(bsize/total)*100;
//			System.out.println(percentage);
//			
//			
//		}
//		return bsize;
//	}
//	
//}

class Average
{
	public double calc(double ... i)
	{
		double sum=0;
		double avg;
		double per;
		for(double j: i)
		{
			sum=sum+j; //90 + 0; 90   //160
			avg=sum/j;//90/90 		160/70
			per=avg*100;
			
			
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(per);
		}
		return sum;
	}
}




public class Varargs { 

	public static void main(String[] args) {
		

//		Bottle m1= new Bottle();
//		m1.size(90);
		
		Average a1=new Average();
		a1.calc(90.0,70.0);
		
		
	}

}