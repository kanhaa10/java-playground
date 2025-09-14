import java.util.Scanner;
public class FactNum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println("factorial is : " + fact);
	}
}