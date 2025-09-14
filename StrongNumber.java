import java.util.Scanner;
public class StrongNumber
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num=sc.nextInt();
		int org=num;
		int digit=0;
		
		int sum=0;
		
		while(num>0){
			digit = num%10;
			int fact=1;
			for(int i=1; i<=digit; i++){
				fact *= i;
				
			}sum = sum + fact;
			num=num/10;
		}
		if(sum==org){
			System.out.println("IS STRONG");
		}else{
			System.out.println("IS NOT");
		}
	}
}