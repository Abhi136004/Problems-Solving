package basic_program;
import java.util.Scanner;
public class GST {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        float cgst = ((9 / 100.0f) * x);
        float sgst = ((11 / 100.0f) * x);
        System.out.println("CGST : " + cgst);
        System.out.println("SGST : " + sgst);


        float total = (float)(x + cgst + sgst);
        System.out.println("Total Price after all GST : " + total);
        in.close();

    }
}
