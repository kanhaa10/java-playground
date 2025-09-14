import java.util.Scanner;
public class IncomeTax
{
	public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your yearly salary");
			double sal=sc.nextDouble();
			double tax=0.0;
			
			if(sal < 250000){
				System.out.println("no tax need to pay");
			}else if(sal>=250000 && sal<=500000){
				tax = sal*0.05;
				System.out.println("tax should be paid is 5% : " + tax);				
			}else if(sal>=500000 && sal<=1000000){
				tax = (sal/100)*20;
				System.out.println("tax should be paid is 20% : " + tax);				
			}else if(sal>1000000){
				tax = sal*0.30;
				System.out.println("tax should be paid is 30% : " + tax);				
			} if(sal>=0){
				System.out.println("your yearly salary is : "+ sal);
				System.out.println("tax who have to pay is : "+ tax);
				System.out.println("money left is : " + (sal-tax));
			}
			sc.close();
		}
}
