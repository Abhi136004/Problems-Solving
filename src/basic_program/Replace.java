package basic_program;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        String str = in.nextLine();

        
        System.out.println(str.replaceAll("[^a-zA-Z]", ""));
        
        in.close();
    }
}
