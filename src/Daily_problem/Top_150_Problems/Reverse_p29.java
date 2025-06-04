package Daily_problem.Top_150_Problems;

public class Reverse_p29 {
    public static void main(String[] args){
        int n = 143;
        //int ans = 0;
        //using while loop
//        while(n > 0){
//            int rem = n%10;
//            ans = (ans * 10) + rem;
//            n /= 10;
//        }
//        System.out.println(ans);
        //using for loop
        String str = String.valueOf(n);
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            String s = str.charAt(i) + "";
            ans  = s + ans;
        }
        System.out.println(ans);
    }
}
