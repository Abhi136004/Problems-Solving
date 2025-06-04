package Daily_problem;

public class Sum_number {
    public static void main(String[] args) {
        String str = "5ingt404e3t";
        int sum = 0;
        int temp = 0;
        boolean flag = false;
        for(int i = 0; i < str.length(); i++){
            int n = str.charAt(i)-'0';
            if(n >= 0 && n <= 9){
                temp = temp*10 + n;
                flag = true;
            }
            else{
                sum += temp;
                temp = 0;
                flag = false;
            }
        }
        if(flag){
            sum += temp;
        }
        System.out.println(sum);
    }
}
