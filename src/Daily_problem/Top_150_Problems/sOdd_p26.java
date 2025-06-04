package Daily_problem.Top_150_Problems;

public class sOdd_p26 {
    //sum of odd numbers followed by odd sequence in an integer.
    public static void main(String[] args){
        int n = 361589;
        int sum = 0;
        int odd = 0;
        // other method of add a number in sequence
        int multiplier = 1;
        while(n > 0){
            int rem = n%10;
            n/=10;
            if(rem % 2 != 0){
                sum += rem;
                odd = odd + (rem * multiplier);
                multiplier *= 10;
            }
        }
        System.out.println(sum + "" + odd);

    }
}
