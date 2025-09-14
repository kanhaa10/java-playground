import java.util.Scanner;
class Add_3_num{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your 1st num : ");
		int num1=sc.nextInt();
		System.out.print("Enter your 2nd num : ");
		int num2=sc.nextInt();
		System.out.print("Enter your 3rd num : ");
		int num3=sc.nextInt();
		int total=num1+num2+num3;
		System.out.println("Sum of these 3 number are : " + total);
	}
}
