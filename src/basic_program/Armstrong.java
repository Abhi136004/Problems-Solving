package basic_program;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int res = isArmstrong(num);
        
        if(num == res){
            System.out.println( num + " is a armstrong number");
        }
        else{
        System.out.println( num + " is not a armstrong number");

        }
        in.close();
    }

    public static int isArmstrong(int n){
        int sum = 0;
        int digit = (int) Math.log10(n) + 1;
        System.out.println(digit);

        while(n > 0){
            int rem = n % 10;
            sum += Math.pow(rem, digit);
            n = n / 10;

        }
        return sum;
    }
}