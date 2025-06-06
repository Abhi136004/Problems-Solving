package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
public class Fre_count_P62 {
    public static void main(String[] args){
        int[] arr = {50,20,150,20,50,10,30,10,10};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                count.add(1);
            }
            else{
                int index = list.indexOf(arr[i]);
                count.set(index,count.get(index)+1);

            }
        }
        for(int j = 0; j < count.size(); j++){
            System.out.println(list.get(j) + "-->" + count.get(j));
        }
    }
}
