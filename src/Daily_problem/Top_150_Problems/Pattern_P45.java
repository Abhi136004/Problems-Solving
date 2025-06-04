package Daily_problem.Top_150_Problems;

public class Pattern_P45 {
    public static void main(String[] args) {
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        pat(5,1);
    }
    static void pat(int r, int c){
        if(r == 0){
            return;
        }
        if(c <= r){
            System.out.print(c);
            pat(r,c+1);
        }
        else{
            System.out.println();
            pat(r-1,1);
        }
    }
}
