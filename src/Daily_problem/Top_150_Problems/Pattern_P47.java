package Daily_problem.Top_150_Problems;

public class Pattern_P47 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
               System.out.print(j);
            }
            System.out.println();
        }
    }
}
