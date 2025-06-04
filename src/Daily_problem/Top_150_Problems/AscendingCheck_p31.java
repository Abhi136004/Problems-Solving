package Daily_problem.Top_150_Problems;

public class AscendingCheck_p31 {
    public static void main(String[] args) {
        int n = 11122256;
        int temp = n;

        while(n > 0){
            int n1 = n%10;
            n /= 10;
            int n2 = n%10;

            if(n1 < n2){
                System.out.println(temp + " Not in ascending sequence");
                break;
            }
        }
        if (n == 0){
            System.out.println("Yes " + temp + " is in ascending sequence");
        }
    }
}
