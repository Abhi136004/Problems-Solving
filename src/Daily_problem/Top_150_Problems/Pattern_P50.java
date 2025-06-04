package Daily_problem.Top_150_Problems;

public class Pattern_P50 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int space = i-1;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int j = n-i+1; j >= 1; j--){
                char ch = (char)('A' + j-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
