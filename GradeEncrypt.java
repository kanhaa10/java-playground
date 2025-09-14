import java.util.Scanner;
public class GradeEncrypt{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your character : ");
		char grade=sc.next().charAt(0);
		
		char encrypt = (char)(grade+8);
		System.out.println("after encyption is : " + encrypt);
		
		System.out.print("Afer decryption is : "+ grade);
	}
}