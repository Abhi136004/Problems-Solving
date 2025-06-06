package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
public class Fre_count_des_P60 {
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
            int index= maximum(count);
            System.out.println(list.get(index) + "-->" + count.get(index));
            count.set(index,0);

        }


    }
    static int maximum(ArrayList<Integer> list){
        Integer max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
                index = list.indexOf(max);
            }
        }

        return index;

    }
}
