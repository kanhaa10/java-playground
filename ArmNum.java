import java.util.Scanner;
public class ArmNum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int original = num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			int cube=digit*digit*digit;
			sum+=cube;
			num/=10;
		}
		if(sum==original){
			System.out.println("IS ARMSTRONG ");
		}else {
			System.out.println("IS NOT ");
		}
	}
}

