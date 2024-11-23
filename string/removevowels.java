import java.util.Scanner;
public class removevowels {
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       removevowels rm = new removevowels();
       String name = s.nextLine();
       String res = rm.remvowels(name);
       System.out.print(res); 
    }
    String remvowels(String n){
        int i;
        String result = "";
        for (i = 0 ;i<n.length();i++){
            char ch = n.charAt(i);
            if(! (ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'|| ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')){
                result =result + ch;
            }


        }
        return result;
    }
}
