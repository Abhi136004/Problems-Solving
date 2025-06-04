package Daily_problem.Top_150_Problems;

public class Sub_p25 {
    public static void main(String ...args){
        int n = 6928;
        String str = String.valueOf(n);
        int ans = 0;
        int i = 0;
        int j = i+1;
        while(j < str.length()){
            int n1 = (int)(str.charAt(i));
            int n2 = (int)(str.charAt(j));
            int value = Math.abs(n1-n2);
            ans = ans * 10 + value;
            i++;
            j++;

            if(j == str.length()){
                if(ans%100 == ans){
                    System.out.println(ans);
                }
                else{
                    str = ans + "";
                    ans = 0;
                    i = 0;
                    j = i+1;
                }
            }
        }
    }
}
