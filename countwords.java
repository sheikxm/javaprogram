import java.util.Scanner;
public class countwords {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        countwords cw = new countwords();
        String name = s.nextLine();
        int res = cw.cwords(name);
        System.out.print(res);
    }
    int cwords(String n){
        int i;
        int count = 1;
        for (i =0;i<n.length(); i++){
            char ch = n.charAt(i);
            if (ch == ' ')
                count+=1;
        }
        return count;

    }
}
