class StudentMarks
{
	String name;
	double marks1,marks2,marks3;
	
	StudentMarks(String name, double m1,double m2,double m3)
	{
		this.name=name;
		this.marks1=m1;
		this.marks2=m2;
		this.marks3=m3;
	}
	
	double average() 
	{
		return (marks1 + marks2 + marks3) / 3;
	}
	
	void displayAverage()
	{
		System.out.println("Average marks is : " + average());
	}
}

public class MainStudentMarks
{
	public static void main (String [] args)
	{
		StudentMarks sm=new StudentMarks("kanhaa", 80,70,60);
		sm.average();
		sm.displayAverage();
	}
}