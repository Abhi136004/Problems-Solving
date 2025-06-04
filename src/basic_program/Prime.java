package basic_program;
import java.util.Scanner;
import java.lang.Math;

public class Prime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        //prime1(num);
        //System.out.println(prime2(num));
        System.out.println(prime3(num));
        in.close();
    }
    // Method 1
    public static void prime1(int num){
        int count = 0;
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println(num + " is not a prime number");
        }
        else{
            System.out.println(num + " is a prime number");
        }
    }
    //Method 2
    public static boolean prime2(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    //Method 3
    public static boolean prime3(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i <= num * 0.5 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}