import java.util.Scanner;
public class dec_2_bin{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int deci=sc.nextInt();
        String bin="";

        while(deci>0){
            int rem = deci%2;
            bin = rem + bin;
            deci = deci/2;
        }
        System.out.println("binary number is : " + bin);

    }
    
}
