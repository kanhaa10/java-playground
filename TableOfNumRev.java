import java.util.Scanner;
public class TableOfNumRev
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int i=10;
		
		while(i>=1)
			{
				System.out.println(num+ " * " + i +" = " + (num*i));
				i--;
			}
	}
}