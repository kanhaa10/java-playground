public class PrimeCheck2 
{
    public static void main(String[] args) 
		{
        int n = 7;           // number to check  // assume number is prime

		for (int i = 2; i <= n/2; i++) { // check divisors up to n/2
               if (n % i == 0) {
               System.out.println(n + " is a prime number.");       // found a diviso
			   } else {
            System.out.println(n + " is NOT a prime number.");
                         // no need to check further
                }
            }
        }
   }

