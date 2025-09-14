import java.util.Scanner;
public class SpaceDetect{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your string");
		String str1=sc.nextLine();
		
		if(str1.contains("  ")){
			System.out.println("Double space is found");
		}else{
			System.out.println("no double space is found");
		}
		if(str1.contains("   ")){
			System.out.println("Triple space is found");
		}else{
			System.out.println("no triple space is found");
		}
	}
}