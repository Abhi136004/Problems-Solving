package basic_program;
import java.util.Scanner;

public class Divisible{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int div = in.nextInt();

        if(num % div == 0){
            System.out.println(num + " is divisible by " + div);
        }
        else{
            System.out.println(num + " is not divisible by " + div);

        }
        in.close();
    }
}