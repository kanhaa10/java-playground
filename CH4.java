import java.util.Scanner;
class CH4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter subject 1 marks: ");
		double sub1=sc.nextDouble();
		System.out.print("Enter subject 2 marks: ");
		double sub2=sc.nextDouble();
		System.out.print("Enter subject 3 marks: ");
		double sub3=sc.nextDouble();
		
		double total=sub1+sub2+sub3;
		double perc=(total/300)*100;
		
		if(perc >=40 && sub1 >=33 && sub2 >=33 && sub3 >=33 ){
			System.out.println("pass ");
		}else{
			System.out.println("fail ");
		}
		sc.close();
	}
}
