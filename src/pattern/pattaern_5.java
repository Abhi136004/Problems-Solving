package pattern;

public class pattaern_5 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= n; i++){
            int a = n-i;
            int b = a;
            for(int j = 1; j <= i; j++){
                char ch = (char)('A' + b);
                b++;
                System.out.print(ch + " ");
            }
            a--;
            System.out.println();
        }
    }
}
