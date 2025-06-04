package basic_program;
import java.util.Scanner;

public class Strongnumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int res = isStrong(num);
       
        
        if(num == res){
            System.out.println( num + " is a strong number");
        }
        else{
        System.out.println( num + " is not a strong number");

        }
        in.close();
    }

    public static int isStrong(int n){
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            int fact = factorial(rem);
            
            sum += fact;
            n = n / 10;

        }
        return sum;
    }
    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        
        return num * factorial(num-1);
    }
}