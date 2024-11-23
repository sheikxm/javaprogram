import java.util.Scanner;
public class sumofascii {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        sumofascii as = new sumofascii();

        String name = s.next();
        int sum = as.sum(name);
        System.out.print(sum);

    }
    int sum(String n){
        int i;
        int sum =0;
        for(i=0;i<n.length();i++){
            char ch = n.charAt(i);
            sum = sum+ch;
        }
        return sum;    
    }
}
