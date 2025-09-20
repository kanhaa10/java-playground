import java.util.Scanner;
class Shoping
{
	private String customerType;
	private double purchaseAmount;
	private double discount;
	private double finalAmount;
	
	Shoping()
	{
		this.customerType="";
		this.purchaseAmount=0.0;
		this.discount=0.0;
		this.finalAmount=0.0;
	}
	
	public void Purchase()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mode online / walk in : ");
		customerType=sc.nextLine();
		
		System.out.print("Enter purchased amoumt : ");
		purchaseAmount=sc.nextDouble();
	}
	
	public void calculatePayment()
	{
		if (purchaseAmount >= 4000) {
			discount = 9.0;
		} else if (purchaseAmount >= 2000 && purchaseAmount <= 3000) {
			discount = 7.0;
		} else if (purchaseAmount >= 2000) {
			discount = 5.0;
		} else {
			discount = 0.0;
		}

		if(customerType.equals("walk in"))
		{
			discount=discount + 2;
		}
	}
	
	public double calculateDiscount()
	{
		finalAmount = purchaseAmount - (discount/100) * purchaseAmount;
		return finalAmount;
	}
	
	
	public void display(){
		System.out.println("final amouont is : " + finalAmount);
	}
	
}

public class MainShoping
{
	public static void main(String []  args)
	{
		Shoping s=new Shoping();
		s.Purchase();
		s.calculatePayment();
		s.calculateDiscount();
		s.display();
	}
}