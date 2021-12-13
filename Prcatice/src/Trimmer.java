class Trimmer{

   String brand="MI";

   Trimmer(String brand)//Syska
   {
		  System.out.println("invoked Timmer no-arg const");
		  System.out.println(this);//this is a keyword in java
		  System.out.println(brand);//Syska //NOVA
		  System.out.println(this.brand);//MI
		  this.brand=brand;//this.brand=Syska //NOVA
		  System.out.println("End of Constructor");

   }


}

class TrimmerStarter{

public static void main(String[] amoeba)
{
Trimmer trimmer=new Trimmer("NOVA");// instantiation
System.out.println(trimmer);//string representation
System.out.println(trimmer.brand);//MI


//Trimmer trimmer1=new Trimmer("Syska");
//System.out.println(trimmer1);//ClassName@Hexadecimal
//System.out.println(trimmer1.brand);


//ThisLocation location=new ThisLocation(45);
//System.out.println(location);
//System.out.println(location.distance);



}

}