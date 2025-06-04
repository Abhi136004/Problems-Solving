package pattern;

public class patter_4 {
    public static void main(String[] args){
        int n = 8;
        for(int i = 0; i < n; i++){
            int a = i;
            for(int j = 0; j <= i; j++){
                char ch = (char)('A' + a);
                a++;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
