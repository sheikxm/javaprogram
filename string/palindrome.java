import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        palindrome p = new palindrome();
        String word = s.next();
        if (p.ispalindrome(word)){
            System.out.print("Palindrome...");
        }else{
            System.out.print("Not a Palindrome...");
        }

    }
    Boolean ispalindrome(String n){
        int i,j;
        for (i=0,j=n.length()-1;i<j;i++,j--){
            char ih = n.charAt(i);
            char jh = n.charAt(j);
            if(ih!=jh)
            return false; 
        }
        return true;
    }
    
}
