package recursion;

public class countZeros {
    public static void main(String[] args) {
        int n = 1003456700;
        System.out.println(CountZeros(n));
    }
    
    static int CountZeros(int n){
        return helper(n,0);
    }
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10,c+=1);
        }
        return helper(n/10,c);
    }
}
