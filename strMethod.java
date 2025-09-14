import java.util.Scanner;
public class strMethod{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String letter = "Dear <name>, Thanks a lot";
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		String newletter = letter.replace("<name>", name);
		System.out.println(newletter);
		sc.close();
	
		
	}
}