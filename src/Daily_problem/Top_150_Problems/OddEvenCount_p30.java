package Daily_problem.Top_150_Problems;

public class OddEvenCount_p30 {
    public static void main(String[] args) {
        int n = 53467;
        int oddCount = 0;
        int evenCount = 0;
        while(n > 0){
            int rem = n%10;
            n /= 10;
            if(rem%2 == 0){
                evenCount += 1;
            }
            else{
                oddCount += 1;

            }
        }
        System.out.println("Even Numbers:" + evenCount);
        System.out.println("Odd Numbers:" + oddCount);
    }
}
