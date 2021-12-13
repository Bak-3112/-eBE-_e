//Encapsulation
//Binding the data into the methods by using getters and setters

//To generate the getters and setters eclipse can do it directly by going to 
	//source option---> Generate setters and getters 


class Employee
{
	private int empno;
	private String empname;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
		System.out.println(empno);
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
		System.out.println(empname);
	}
	

}



public class Encapsulation {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.setEmpname("Arun");
		e1.setEmpno(65);
		
		
		
	}

}
