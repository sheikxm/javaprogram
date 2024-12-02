import java.util.Scanner;
public class longestword {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        longestword l = new longestword();
        String sent = s.nextLine();
        char result = l.longword(sent);
        System.out.print(result);
    }

    char longword(String s){
        int i;
        String result ="";
        int count=0;
        int j;
        int n =s.length();
        for(i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                count++;
            }
            else{
                for(j=i;j>0;j--){
                    
                }
            }

                
            }
        }
    }
//coment

}
