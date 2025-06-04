package basic_program;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no.of 100 rs notes, 500 rs notes and 1000 rs notes you need : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int total_amount = (n1 * 100) + (n2 * 500) + (n3 * 1000);
        System.out.println("Total Amount : " + total_amount);
        in.close();

    }
}
