package Daily_problem;

public class Words_diff {
    public static void main(String[] args) {
        String str1 = "developer".toLowerCase();
        String str2 = "Fresher".toLowerCase();
        check(str1,str2);
        check(str2,str1);
        System.out.println(ans);
    }
    static String ans = "";
    static void check(String s1, String s2){
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(!(s2.contains(ch + ""))){
                ans += ch;
            }
        }
    }
}
