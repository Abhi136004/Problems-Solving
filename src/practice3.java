import java.util.ArrayList;

public class practice3 {
     static int hasUniqueChars(String str) {
        ArrayList<Character> list = new ArrayList<>();

        for (char c : str.toCharArray()) {



            if (!list.contains(c)) {
                 // Duplicate found
                list.add(c);
            }

        }
        System.out.println(list);

        return list.size(); // All characters are unique
    }

    public static void main(String[] args) {
        String input = "my name is granar";
        char input2 = 'a';
       input = input.replaceAll(" ", "");
       System.out.println(input);
       int f = input.indexOf(input2);
       int s = input.indexOf(input2,f+1);
       String sub= input.substring(f,s);
//       for(int i = 0; i < input.length(); i++){
//           char ch = input.charAt(i);
//           if(ch == input2){
//               for(int j = i+1; j<input.length(); j++){
//                   char ch2 = input.charAt(j);
//                   if(ch2 == input2){
//                       sub = input.substring(i,j);
//                       System.out.println(sub);
//                       break;
//                   }
//               }
//               break;
//           }
//
//       }

       System.out.println(hasUniqueChars(sub));
    }
}
