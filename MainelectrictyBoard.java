/*An electricity board wants to automate its billing system. A customer provides their name, type (Domestic or Commercial), and the number of units consumed.
The charges are as follows:

Up to 100 units = ?5 per unit

101 to 300 units = ?7 per unit

Above 300 units = ?10 per unit

If the customer type is Commercial, then a 10% surcharge is added on the bill amount.
Write a program using a class to accept customer details, calculate the bill, and display the final payable amount.*/

import java.util.Scanner;
class electrictyBoard
{
	private String name;
	private String billType;
	private  double unitConsumed;
	private double payeeAmount;
	
	
	
	electrictyBoard()
	{
		this.name="";
		this.billType="";
		this.unitConsumed=0.0;
		this.payeeAmount=0.0;
	}
	
	public void customerDetail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter customer name : ");
		name=sc.nextLine();
		
		System.out.print("enter bill Type : ");
		billType=sc.nextLine();
		
		System.out.print("enter unit consumed : ");
		unitConsumed=sc.nextDouble();
	}
	
	public void calculateBill()
{
    if(unitConsumed <= 100)
    {
        payeeAmount = unitConsumed * 5;
    }
    else if (unitConsumed <= 300) 
    {
        payeeAmount = (100 * 5) + ((unitConsumed - 100) * 7);
    }
    else 
    {
        payeeAmount = (100 * 5) + (200 * 7) + ((unitConsumed - 300) * 10);
    }

    if (billType.equalsIgnoreCase("Commercial")) {
        payeeAmount += (0.10 * payeeAmount); 
    }
}

	
	public void displayPayeeAmount()
	{
		System.out.print("total amt is : " + payeeAmount);
	}
	
}

public class MainelectrictyBoard
{
	public static void main(String [] args)
	{
		electrictyBoard eb=new electrictyBoard();
		eb.customerDetail();
		eb.calculateBill();
		eb.displayPayeeAmount();
	}
}