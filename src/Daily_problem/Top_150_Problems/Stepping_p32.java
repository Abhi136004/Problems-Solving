package Daily_problem.Top_150_Problems;

public class Stepping_p32 {
    public static void main(String[] args) {
        int n = 1234545;
        int temp = n;

        while(temp > 0){
            int n1 = temp % 10;
            temp /= 10;
            int n2 = temp % 10;

            if(Math.abs(n2-n1) != 1){
                System.out.println( n + " is not a stepping number" );
                break;
            }

        }
        if(temp == 0){
            System.out.println("Yes " + n + " is a stepping number");
        }
    }
}
