package basic_program;
import java.util.Scanner;

public class MSB_Digit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n >= 10){
            n /= 10;
        }
        System.out.println("MSB digit : " + n);
        in.close();        
    }
}
