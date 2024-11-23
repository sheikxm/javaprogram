import java.util.Scanner;

//input = raja ram mohan rai
//output = ajar mar nahom iar
public class reverseline {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        reverseline r = new reverseline();
        
        String word = s.nextLine();
        String reversedword = r.reversedword(word);
        System.out.println(reversedword);
    }

    String reversedword(String w){
        reverseline r = new reverseline();

        int i;
        String words = "";
        String val ="";
        for(i=w.length()-1;i>=0;i--){
            char ch = w.charAt(i);
            if (ch == ' ' ){
                val = r.reverse(val);
                words = words+ val+" ";
                val ="";
            }else{
                val = val+ch;
            }


        }
        words = words+ r.reverse(val);
    
        return words;


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
