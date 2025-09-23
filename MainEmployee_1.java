/*A company wants to maintain employee details and calculate their salary.

Requirements:

Store employee name, id, basic salary.

Calculate net salary (basic salary + bonus).

If years of experience > 5 → bonus = 20% of salary.

Else → bonus = 10% of salary.

Display employee details with net salary.*/

class Employee_1
{
	private String name;
	private int id;
	private double salary;
	private int yearsOfExperience;
	private double netSalary;
	
	Employee_1(String name, int id, double salary, int yearsOfExperience)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.yearsOfExperience=yearsOfExperience;
	}
	
	void calculateSalary()
	{
		if(yearsOfExperience > 5)
		{
			salary = 0.20 * salary;
			netSalary += salary;
		}else
		{
			salary = 0.10 * salary;
			netSalary += salary;
		}
	}
	
	
	void display()
	{
		System.out.println("Employee name : " + name);
		System.out.println("Year of experience user has : " + yearsOfExperience);
		System.out.println("Employee new salary : " + netSalary);
		
	}	
	
	
}

public class MainEmployee_1
{
	public static void main(String [] args)
	{
		Employee_1 e=new Employee_1("Harsh" , 1 , 20000 , 10 );
		e.calculateSalary();
		e.display();
	}
}