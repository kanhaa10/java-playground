public class LargestNumber
{
	public static void main(String args[])
	{
		int a=20 , b=69 , c=100;
		
		if(a>b && a>c){
			System.out.println(" a is greater " + a);
		}else if(b>c && b>a){
			System.out.println("b is greater "+ b);
		}else if (c>a && c>b){
			System.out.println("c is greater " + c);
		}
	}
}