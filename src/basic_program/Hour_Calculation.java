package basic_program;
import java.util.Scanner;
public class Hour_Calculation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    int days = in.nextInt();
    int hours = days * 24;
    int minutes = hours * 60;
    int seconds = minutes * 60;

    System.out.println("Hours : " + hours);
    System.out.println("Minutes : " + minutes);
    System.out.println("Seconds : " + seconds);
    in.close();
    }
}
