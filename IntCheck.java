import java.util.Scanner;
public class IntCheck{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your number : ");
	int num=sc.nextInt();
	
	if(num >= 0 ){
		System.out.print("number is an integer ");
	}else{
		System.out.print("numebr is not an integer");
	}
	}
}