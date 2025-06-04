package basic_program;
import java.util.Scanner;
public class Mark_percentage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();
        int m4 = in.nextInt();
        int m5 = in.nextInt();
        
        int sum = m1 + m2 + m3 + m4 + m5;

        float percentage = (sum / 500.0f) * 100;
        System.out.println("Total marks : " + sum);
        System.out.println("Percentage : " + percentage + "%");
        in.close();
    }
    
}
