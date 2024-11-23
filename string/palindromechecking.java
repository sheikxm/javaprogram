import java.util.Scanner;
public class palindromechecking {
    public static void main (String Args[]){
        Scanner s = new Scanner(System.in);
        palindromechecking p = new palindromechecking();

        String word = s.nextLine();
        String reverse = p.reverse(word);

        if (word.equals(reverse)){
            System.out.print("it is palindrome.. ");
            
        }

            else{
                System.out.println("it is not a palindrome.. ");
                System.out.println(word);
                System.out.println(reverse);
            }
    }
    String reverse(String n){
        int i;
        String result = "";
        for (i=n.length()-1;i>=0;i--){
            char ch = n.charAt(i);
            result = result+ch;
        }
        return result;

    }
}
