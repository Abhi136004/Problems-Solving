package Daily_problem.Top_150_Problems;

public class count_p28 {
    public static void main(String[] args){
        int n = 361589, oddseq = 0, evenseq = 0, cEven = 0, cOdd = 0, Emul = 1, Omul = 1;

        while(n > 0){
            int rem = n%10;
            n /= 10;
            if(rem %2 == 0){
                cEven += 1;
                evenseq = evenseq + (rem * Emul);
                Emul *= 10;
            }
            else{
                cOdd += 1;
                oddseq = oddseq + (rem * Omul);
                Omul *= 10;
            }
        }
        System.out.println(oddseq + "" + cOdd + "" + evenseq + "" + cEven);
    }
}
