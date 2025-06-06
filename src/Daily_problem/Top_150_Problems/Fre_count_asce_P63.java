package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
public class Fre_count_asce_P63 {
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
            int index = minimum(count);
            System.out.println(list.get(index) + "-->" + count.get(index));
            count.set(index,-1);
        }
    }
    static int minimum(ArrayList<Integer> list){
        Integer min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min && list.get(i) > 0){
                min = list.get(i);
                index = list.indexOf(min);
            }
        }

        return index;

    }
}
