import java.util.Scanner;

public class reverseword {
    public static void main (String Args[]){
        Scanner s = new Scanner(System.in);
        reverseword rv = new reverseword();

        String word = s.next();
        String rev = rv.reverse(word);
        System.out.print(rev);
    }
    String reverse(String word){
        int i;
        String rev = "";
        for (i=word.length()-1;i>=0;i--){
            char ch = word.charAt(i);
            rev = rev+ch;
        }
        return rev;
    }
}
