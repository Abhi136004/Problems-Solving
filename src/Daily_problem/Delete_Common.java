package Daily_problem;

public class Delete_Common {
    public static void main(String[] args) {
        String str1 = "aaaa";
        String str2 = "aaabbbb";
        String ans1 = isCommon(str1, str2);
        String ans2 = isCommon(str2, str1);
        System.out.println(ans1+ans2);

    }
    static String isCommon(String str1, String str2){
        String ans = "";
        for(int i = 0; i < str1.length(); i++){
            String ch = str1.charAt(i)+ "";
            if(!str2.contains(ch)){
                ans += ch;
            }
        }
        return ans;
    }
}
