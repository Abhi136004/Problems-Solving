package basic_program;
import java.util.Scanner;
public class UnitDigit {
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int digit = n % 10;

    System.out.println("Unit Digit of the Number is : " + digit);
    in.close();
   } 
}
