import java.util.Scanner;
public class removeconsonants {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        removeconsonants rm = new removeconsonants();
        String name = s.nextLine();
        String res = rm.remcon(name);
        System.out.print(res);
    }
    String remcon(String n){
        int i;
        String result = "";
        for (i =0;i<n.length();i++){
            char ch = n.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch>= 'a' && ch<= 'z')){
                if (ch == 'A'|| ch == 'E'|| ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                    result = result +ch;
                }
            }
            else{
                result = result+ch;
            }
        }
        return result;
    }

}
