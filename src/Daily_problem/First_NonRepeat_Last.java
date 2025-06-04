package Daily_problem;

public class First_NonRepeat_Last {
    public static void main(String[] args) {
        int n = 883144;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        boolean flag = false;
        for(int i = ch.length-1; i >= 0; i--){
            if(ch[i] == (char)-1){
                continue;
            }
            for(int j = i-1; j >=0; j--){
               if(ch[i] == ch[j]){
                   ch[j] = (char)-1;
                   break;
               }
               if(j == 0){
                   flag = true;
               }
            }
            if(flag){
                System.out.println(ch[i]);
                break;
            }

        }
    }
}
