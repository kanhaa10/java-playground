import java.util.Scanner;
public class SumOfResult
{
	public static void main(String [] args)
	{
		int table=8;
		int sum=0;
		
		for(int i=1; i<=10; i++){
			int product = table*i;
			sum =sum+product;
		}
		System.out.println("sum is : "+ sum);
	}
}