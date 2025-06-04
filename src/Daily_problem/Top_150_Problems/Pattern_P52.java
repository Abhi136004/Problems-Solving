package Daily_problem.Top_150_Problems;

public class Pattern_P52 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                pat(j,'{');
                pat(j,'}');
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pat(int n, char ch){
        for(int i = 1; i <= n; i++){
            System.out.print(ch);
        }
    }
}
