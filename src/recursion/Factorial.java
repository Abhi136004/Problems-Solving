package recursion;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial1(n));
        System.out.println(factorial2(n));
        in.close();

    }

    // Normal using for loop
    static int factorial1(int n) {
        // factorial of 0 & 1 is 1
        if (n < 2) {
            return 1;
        }
        // Initialize fact to 1, because if it is 0 then multiples gives u 0

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            // Multiplying each number with fact till n
            fact = fact * i;
        }
        return fact;
    }
        // Recursion method
    static int factorial2(int n) {
        // factorial of 0 & 1 is 1 (Base case)
        if (n < 2) {
            return 1;
        }
        // Calls function till factorial(1);
        // then it is multiplied with number while returning
        return n * factorial2(n - 1);
    }
}