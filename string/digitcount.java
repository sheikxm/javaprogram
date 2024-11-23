import java.util.Scanner;
public class digitcount {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        digitcount dg = new digitcount();
        String name = s.nextLine();
        int res = dg.digitcount(name);
        System.out.print(res);

    }
    int digitcount(String n){
        int i;
        int count = 0;

        for(i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if (ch >= '0' && ch <= '9')
            count+=1;
        }
        return count;

    }
}
