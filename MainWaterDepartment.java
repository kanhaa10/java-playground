//A Water Supply Department wants to prepare bills for customers based on the liters of water consumed in a month.

//For the first 500 liters, the cost is ₹2 per liter.

//For the next 1000 liters (i.e., from 501 to 1500), the cost is ₹3 per liter.

//For any consumption above 1500 liters, the cost is ₹5 per liter.

//Additionally:

//If the connection type is Commercial, then a 15% surcharge is added on the final bill.

//The program should:

//Take customer details (name, connection type, liters consumed).

//Calculate the bill as per the rules.

//Display the final payable amount.*/

import java.util.Scanner;
class WaterDepartment
{
	private String userName;
	private String usageType;
	private double waterLiterUsed;
	private double payeeAmount;
	
	WaterDepartment()
	{
		this.userName="";
		this.usageType="";
		this.waterLiterUsed=0.0;
		this.payeeAmount=0.0;
	}
	
	public void customerDetail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your name : ");
		userName=sc.nextLine();
		
		System.out.print("enter type of water used : ");
		usageType=sc.nextLine().toLowerCase();
		
		System.out.print("enter amount of litre water used : ");
		waterLiterUsed=sc.nextDouble();
	}
	
	public void calculateBill()
	{
		if(waterLiterUsed <= 500)
		{
			payeeAmount = waterLiterUsed * 2;
		}else if (waterLiterUsed >=501 && waterLiterUsed <= 1500)
		{
			payeeAmount = (500 * 2) + (( waterLiterUsed - 500 ) * 3 );
		}else
		{
			payeeAmount = (500 * 2) + (1000 * 3) + (( waterLiterUsed - 1500 ) * 5 );
		}
		
		if (usageType.equalsIgnoreCase("commercial"))
		{
			payeeAmount = payeeAmount + (0.15 * payeeAmount);
		}
	}
	
	public void displayAmount()
	{
		System.out.print("total amount is : " + payeeAmount);
	}
	
	
}

public class MainWaterDepartment
{
	public static void main(String [] args)
	{
		WaterDepartment wd=new WaterDepartment();
		wd.customerDetail();
		wd.calculateBill();
		wd.displayAmount();
	}
}