package recursion;
import java.util.ArrayList;
public class Maze{
    public static void main(String[] args){
        int r = 3;
        int c = 3;

        System.out.println(path3("", r,c));
        
    }
    // 2 Paths(Right and Down)
    static ArrayList<String> path2(String ans, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();

        if(r > 1){
            res.addAll(path2(ans + 'D' , r-1, c));
        }
        if(c > 1){
            res.addAll(path2(ans + 'R' , r , c-1));
        }
        return res;
    }
    // 3 Paths(Right, Down, diagonal)
    static ArrayList<String> path3(String ans, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        if(r > 1 && c > 1){
            res.addAll(path3(ans + 'd' , r-1 , c-1));

        }

        if(r > 1){
            res.addAll(path3(ans + 'D' , r-1, c));
        }
        if(c > 1){
            res.addAll(path3(ans + 'R' , r , c-1));
        }
        
        return res;
    }
}