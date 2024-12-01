import java.util.Scanner;
public class firstnonrepeatingcharacter {
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    firstnonrepeatingcharacter f = new firstnonrepeatingcharacter();
    String str = s.next();
    char result = f.nonrepeating(str);
    System.out.print(result);
}   

public char nonrepeating(String s ){
    int hash[] = new int[26];
    int n =s.length();

    int i;
    for(i=0;i<n;i++){
        char ch = s.charAt(i);
        hash[ch-97]++;
    }
    
    for(i=0;i<n;i++){
        char ch = s.charAt(i);
        if (hash[ch-97]==1){
            return  ch;
        }
    }
    
    return 0;

}
}
