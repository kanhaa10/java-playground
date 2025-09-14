import java.util.Scanner;
public class DayCheck
{
	public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the day you want to check : ");
			int day=sc.nextInt();
			
			if(day==1){
				System.out.println(day + " is for Monday ");
			}else if(day==2){
				System.out.println(day + " is for Tuesday");
			}else if(day==3){
				System.out.println(day + " is for Wednesday");
			}else if(day==4){
				System.out.println(day + " is for Thursday");
			}else if(day==5){
				System.out.println(day + " is for Friday");
			}else if(day==6){
				System.out.println(day + " is for Saturday");
			}else if(day==7){
				System.out.println(day + " is for Sunday");
			}else{
				System.out.println("Bitch give correct input");
			}
			sc.close();
		}
}