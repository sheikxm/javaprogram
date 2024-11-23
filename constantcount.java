import java.util.Scanner;

public class constantcount {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        constantcount c = new constantcount();
        String name = s.nextLine();
        int res = c.conscount(name);
        System.out.print(res);

    }
    int conscount(String n){
        
        int i;
        int count = 0;
        for (i =0;i<n.length();i++){
            char ch = n.charAt(i);
            if ((ch >='A' && ch <= 'Z' )|| (ch >= 'a' && ch <= 'z'))
            count+=1;
        }
        return count;


    }
    
}
