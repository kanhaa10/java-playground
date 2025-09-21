/*A company wants a program to manage Employee Salary Calculation.
The system should:

Store employee details (name, basic salary, years of experience).

Calculate bonus:

If years of experience > 5 → bonus = 20% of salary.

Else bonus = 10% of salary.

Calculate net salary = basic salary + bonus.

Display all details with net salary.*/

import java.util.*;

class EmployeeSalary 
{
	private String name;
	private double salary;
	private int yrOfExperience;
	private double bonus;
	private double netSalary;
	
	
	void employeeDetail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name : ");
		name=sc.nextLine();
		System.out.print("Enter salary of employee : ");
		salary=sc.nextDouble();
		System.out.print("how many yr of experience does employee has : ");
		yrOfExperience=sc.nextInt();
	}
	
	void calculateSalary() 
	{
        if (yrOfExperience >= 5) 
		{
            bonus = 0.20 * salary; 

        } else 
		{
            bonus = 0.10 * salary; 
        }
        netSalary = salary + bonus;
    }
	
	void display()
	{
		System.out.println("----Employee Detail----");
		System.out.println("Naame: " + name );
		System.out.println("Salary: " + salary);
		System.out.println("Experience: "+ yrOfExperience);
		System.out.println("Bonus: " + bonus);
		System.out.println("Net salary: " + netSalary);
		
	}
	
	
}

public class MainEmployeeSalary
{
	public static void main(String [] args)
	{
		EmployeeSalary es=new EmployeeSalary();
		es.employeeDetail();
		es.calculateSalary();
		es.display();
	}
}