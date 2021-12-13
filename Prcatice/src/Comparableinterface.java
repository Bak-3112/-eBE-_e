import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{

	int rollno,marks;
	String name;
	public Stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Stud o) {
		return name.length()>o.name.length()?1:-1;
	}
	
	
	
	
	
	
}

public class Comparableinterface {

	public static void main(String[] args) {

		List<Stud> stud= new ArrayList<Stud>();
		stud.add(new Stud(1,55,"Arun"));
		stud.add(new Stud(1,89,"Uppendra"));
		stud.add(new Stud(1,92,"Vijay"));
		stud.add(new Stud(1,69,"Uday"));
		stud.add(new Stud(1,71,"Anjan"));
		
		
		Collections.sort(stud);
		
		for(Stud s:stud)
		{
			System.out.println(s);
		}
		
		
		
		
	}

}
