import java.util.Scanner;
public class countspecialcharacters {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        countspecialcharacters csp = new countspecialcharacters();
        String name = s.nextLine();
        int res = csp.countcharacters(name);
        System.out.print(res);
    }
    int countcharacters(String n){
        int i;
        int count =0;
        for (i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
            count+=1;
        }
        return count;
    }
}
