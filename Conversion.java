import java.util.Scanner;
public class Conversion{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter kilo meter : ");
		double km=sc.nextDouble();
		
		double mile=km*0.621;
		System.out.println(km + " in mile is " + mile);
	}

}