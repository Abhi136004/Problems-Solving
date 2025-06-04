package basic_program;
import java.util.Scanner;
public class AddedFraction {
    public static void main(String[] str){
        Scanner in = new Scanner(System.in);

        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float total = n1 + n2;
        total -= (int)(total);
        System.out.println(total);
        in.close();
    }
}
