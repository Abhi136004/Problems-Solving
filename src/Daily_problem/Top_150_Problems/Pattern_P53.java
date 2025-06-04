package Daily_problem.Top_150_Problems;

public class Pattern_P53 {
    public static void main(String[] args) {
    int n = 8;

    for(int i = 1; i <= n*2-1; i++){
        int space = 0;
        int end = 0;
        if (i <= n) {
            space = i-1;
            end = n-i+1;
        }
        else{
            space = (2*n)-i-1;
            end = i-n+1;
        }
        for(int s = 1; s <= space; s++){
            System.out.print(" ");
        }
        for(int j = 1; j <= end; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
