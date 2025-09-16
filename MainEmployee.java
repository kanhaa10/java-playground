class Employee
{
	String empId;
	double salary;
	
	Employee(String empId, double salary)
	{
		this.empId=empId;
		this.salary=salary;
	}
	
	void raiseSalary(double percentage)
	{
		salary = salary = salary + (salary * percentage / 100);
	}
	
	void displayDetail()
	{
		System.out.format("new salary is : " + salary);
	}
}

public class MainEmployee
{
	public static void main(String [] args)
	{
		Employee e=new Employee("Harsh" , 40000);
		e.raiseSalary(20);
		e.displayDetail();
	}
}