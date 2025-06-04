package important;

public class Highest_frequency {
    public static void main(String[] args){
        int[] a ={30,100,20,110,200,40,50};
        int fcount = 0;
        for(int i = 0 ; i < a.length; i++){
            int count = 1;
            if(a[i] == -1){
                continue;
            }
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                    a[j] = -1;
                }
            }
            fcount = (count > fcount)?count:fcount;
        }
        if(fcount > 1){
            System.out.println(fcount);
        }
        else{
            System.out.println(-1);
        }
    }
}
