package basic_program;

import java.util.Scanner;
public class Addition_multiplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int total = (n1 + n2) * n3;
        ;
        System.out.println("The answer is : " + total);
        in.close();
    }
}
