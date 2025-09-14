import java.util.Scanner;
public class SumFactorial
{
	public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int num=sc.nextInt();
			int fact=1;
			int sum=0;
			int n=0;
			
			
			for(int i=1; i<=5; i++)
				{
					fact=fact*i;		
				}
			while(fact>0)
				{
					sum=sum+fact%10;
					fact=fact/10;
				}
			System.out.print(sum);
		}		
}