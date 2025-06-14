package Daily_problem.Top_150_Problems;

public class Robo_P131 {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        String str1 = "2-2-E";
        String str2 = "R M L M L M R M ";
        System.out.println(robo(n1,n2,str1,str2));
    }
    static String robo(int input1,int input2,String input3,String input4){
        int x = input1;
        int y = input2;
        String str = input3.replaceAll("-","");
        int[] arr = new int[2];
        arr[0] = str.charAt(0)-'0';
        arr[1] = str.charAt(1)-'0';
        char dir = str.charAt(2);
        input4 = input4.replaceAll(" ","");
        boolean flag = false;
        for(int i = 0; i < input4.length(); i++){
            char ch = input4.charAt(i);
            if(ch == 'R'){
                if(dir == 'N'){
                    dir = 'E';
                }
                else if(dir == 'E'){
                    dir = 'S';
                }
                else if(dir == 'S'){
                    dir = 'W';
                }
                else{
                    dir = 'N';
                }
            }
            else if(ch == 'L'){
                if(dir == 'N'){
                    dir = 'W';
                }
                else if(dir == 'E'){
                    dir = 'N';
                }
                else if(dir == 'S'){
                    dir = 'E';
                }
                else{
                    dir = 'S';
                }
            }
            else{
                if(dir == 'N'){
                    if(arr[1] >= y){
                        flag = true;
                        break;
                    }
                    arr[1] += 1;
                }
                else if(dir == 'S'){
                    if(arr[1] <= 0){
                        flag = true;
                        break;
                    }
                    arr[1] -= 1;
                }
                else if(dir == 'E'){
                    if(arr[0] >= x){
                        flag = true;
                        break;
                    }
                    arr[0] += 1;
                }
                else{
                    if(arr[0] <= 0){
                        flag = true;
                        break;
                    }
                    arr[0] -= 1;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(arr[0]+"--");
        ans.append(arr[1] + "--");
        ans.append(dir+"");
        if(flag){
            ans.append("-ER");
        }
        return ans.toString();
    }
}
