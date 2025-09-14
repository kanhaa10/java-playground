public class FibonacciNumbers
{
	public static void main(String [] args)
	{
		int a=0;
		int b=1;
		int sum =0;
		
		System.out.print(a + " " + b + " ");
		
		for(int i=0; i<8; i++){
			sum = a+b;
			a=b;
			b=sum;
			System.out.print(sum + " ");
		}
	}
}