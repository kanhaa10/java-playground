import java.util.Scanner;
public class LowerCase{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String normalStr = sc.nextLine();
		
		String lowerStr = normalStr.toLowerCase();
		System.out.println("lower case string is : "+ lowerStr);
		
	}
}