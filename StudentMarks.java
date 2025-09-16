public class StudentMarks
{
	String name;
	double marks;
	
	StudentMarks(String name , double marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	char calculategrade()
	{
		if(marks >=90) return 'A';
		else if(marks >=80) return 'B';
		else if(marks >=70) return 'C';
		else if(marks >=60) return 'D';
		else if(marks >=50) return 'E';
		else return 'F';		
	}
	
	void displayDetail()
	{
		System.out.println(name + " - Marks: " + marks + " Grade: " + calculategrade());
	}
	
}

public class MainStudent
{
	public static void main(String [] args)
		{
			StudentMarks sm1=new StudentMarks("Aayush", 69);
			StudentMarks sm2=new StudentMarks("kritiii", 89);
			
			
			sm1.displayDetail();
			sm2.displayDetail();
		}
}