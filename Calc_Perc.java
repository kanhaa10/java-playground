import java.util.Scanner;
class Calc_Perc{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks of ADBMS : ");
		int sub1=sc.nextInt();
		System.out.print("Enter marks of JAVA : ");
		int sub2=sc.nextInt();
		System.out.print("Enter marks of PYTHON : ");
		int sub3=sc.nextInt();
		System.out.print("Enter marks of DCCN : ");
		int sub4=sc.nextInt();
		System.out.print("Enter marks of yoga : ");
		int sub5=sc.nextInt();
		
		double perc = (sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("Percentage is : " + perc);
	}
}
