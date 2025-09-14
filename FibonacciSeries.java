public class FibonacciSeries {
    public static void main(String [] args) {
        int a=0;
        int b=1;
        int sum=0;
        int last=100;

        System.out.print(a + " " + b); // print first two

        sum = a+b;
        while(sum <= last) {           // include equal limit
            System.out.print(" " + sum); // print current sum first
            a = b;                      
            b = sum;                    
            sum = a+b;                  
        }
    }
}
