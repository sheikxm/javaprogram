import java.util.Scanner;
public class pangram {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        pangram p = new pangram();
        
        String sentence = s.nextLine();
        if (sentence.length() < 26){
            System.out.print("Not Pangram");
        }
        else{
            System.out.print(p.ispangram(sentence));
        }
    }
    String ispangram(String sen){
        int i;
        int arr [] = new int[128];
        for(i=0;i<sen.length();i++){
            char ch = sen.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            arr[ch-65] = arr[ch-65]+1;
            else if (ch >= 'a'&& ch<='z'){
                arr[ch-97] = arr[ch-97]+1;
            } 
            
            
        
        }
        for (i=0;i<26;i++){
            if (arr[i] == 0){
                return "Not Pangram";
            }

        }return "pangram";
        
    }
}

