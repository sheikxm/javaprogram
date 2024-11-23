import java.util.Scanner;
public class expandstring {

//input = ab2ac2ad2
//output = ababacacadad
//output = ababacacadad
    public static void main(String args[]){

    Scanner s = new Scanner(System.in);
    expandstring ex = new expandstring();

    String words = s.nextLine();
    String result = ex.expand(words); 
    System.out.print(result);

}

 String expand(String s1){
    int i;
    int count=0;
    String words = "";
    String var = "";
    for (i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        if (ch >= '0'&& ch <= '9'){
            count = (int )ch - 48;
        }
        else{
            var= var+ch;
        }
        while (count >0){
            words = words+var;
            count-=1;
            if (count == 0){
                var = "";
            }


        }
        
 }
 return words;
}

}

