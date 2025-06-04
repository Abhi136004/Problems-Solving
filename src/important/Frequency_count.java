package important;
import java.util.ArrayList;
public class Frequency_count{
    public static void main(String[] args){
        int[] a = {50,20,150,20,50,10,30,10,10};
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> value = new ArrayList<>();

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
            c.add(count);
            value.add(a[i]);
        }
       
       for(int i = 0; i < c.size(); i++){
            int max = i;
            for(int j = 0; j < c.size(); j++){
                if(c.get(j) > c.get(max)){
                    max = j;
                }
            }
            System.out.println(value.get(max) + " --> " + c.get(max));
            c.set(max,-1);
        }
    }
}