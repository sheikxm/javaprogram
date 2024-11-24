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
    int i,j;
    int counter =0;
    String words = "";
    String var = "";
    for (i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        if ((ch >= 'A' && ch<= 'Z' || ch >='a' && ch <='z') && counter ==0){
            var = var+ch;

        }
        else if (ch >= 48 && ch <=57){
            counter = counter*10+ ch-47;

        }  
        else if ((ch >= 'A' && ch<= 'Z' || ch >='a' && ch <='z') && counter >0){
            for(j=0;j<counter;j++){
                words = words+var;
                
            }
            words= "";
            counter =0;
            2
            
        }
        for(j=0;j<counter;j++){
            words = words+var;
        }
    }
    return words;
}
}


