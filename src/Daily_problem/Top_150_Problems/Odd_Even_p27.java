package Daily_problem.Top_150_Problems;

public class Odd_Even_p27 {
    public static void main(String[] args){
        int n = 361589;
        int odd = 0;
        int even = 0;
        int evemultiplier = 1;
        int oddmultiplier = 1;
        while(n > 0){
            int rem = n%10;
            n /= 10;
            if(rem % 2 == 0){
                even = even + (rem * evemultiplier);
                evemultiplier *= 10;
            }
            else{
                odd = odd + (rem * oddmultiplier);
                oddmultiplier *= 10;
            }

        }

        System.out.println(odd + "" + even);
    }
}
