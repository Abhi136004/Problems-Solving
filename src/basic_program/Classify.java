package basic_program;
import java.util.Scanner;
public class Classify {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("h : ");
        int h = in.nextInt();
        System.out.print("c : ");
        float c = in.nextFloat();
        System.out.print("ts : ");
        int t = in.nextInt();
        ClassifyGivensteel(h , c, t);
        in.close();
    }
    static void ClassifyGivensteel(int h, float c, int t){
        if(h > 60 && c > 0.8 && t > 5700){
            System.out.println("Class 'A'");
        }
        else if(h > 60 && c > 0.8){
            System.out.println("Class 'B'");
        }
        else if(h > 60 && t > 5700){
            System.out.println("Class 'c'");
        }
        else if(c > 0.8 && t > 5700){
            System.out.println("Class 'D'");
        }
        else if(h > 60 || c > 0.8 || t > 5700){
            System.out.println("Class 'E'");
        }
        else{
            System.out.println("Class 'E'");
        }
    }
    
}
