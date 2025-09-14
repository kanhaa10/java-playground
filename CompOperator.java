import java.util.Scanner;
public class CompOperator{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number : ");
		double num=sc.nextDouble();
		double numToCheck=10.0;
		
		if(num>numToCheck){
			System.out.format("Enterd number is grater than intial number");
		}else{
			System.out.printf("Entered number is smaller than intial number");
		}
		
	}
}