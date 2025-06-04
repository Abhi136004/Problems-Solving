package Company.mercer;

public class String_prime {
    public static void main(String[] args) {
        String str = "Fia88201Ot";
        int sum = 0;
        String ans = "";
        for(int i = 0; i < str.length(); i++){

            int n = (int)str.charAt(i);

            if(isprime(n)){
                ans += str.charAt(i) + "";
                sum += n;
            }
        }
        System.out.println(ans + " : " + sum);
    }
    static boolean isprime(int n){
        if(n < 2){
            return false;
        }
        int count = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
}
