import java.util.Scanner;
class vowels {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        vowels v = new vowels();
        String name = s.nextLine();
        int res = v.vowcount(name);
        System.out.print(res);
    }
    int vowcount(String n){
        int count = 0;
        int i;
        for (i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if (ch == 'a'|| ch =='e'||ch == 'i'|| ch =='o'||ch == 'u'|| ch =='A'||ch == 'E'|| ch =='I'||ch == 'O'|| ch =='U'){
                count+=1;
            }

        }
        return count;
    }
}