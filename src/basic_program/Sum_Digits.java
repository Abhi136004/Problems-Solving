package basic_program;
import java.util.Scanner;
public class Sum_Digits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of digits : " + sum);
        System.out.println(sumOfDigits(n));
        in.close();
    }

    //recurssion method
    static int sumOfDigits(int n){
        if(n < 10){
            return n ;
        }
        int rem = n%10;
        return rem + sumOfDigits(n/10);
    }
}
