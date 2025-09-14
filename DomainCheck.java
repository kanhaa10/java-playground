import java.util.Scanner;
public class DomainCheck
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter web name : ");
		String type=sc.nextLine();
		
		if(type.contains(".com")){
			System.out.print("commercial website");
		}else if(type.contains(".org")){
			System.out.print("organisation website");
		}else if(type.contains(".in")){
			System.out.print("indian website");
		}
		sc.close();
	}
}