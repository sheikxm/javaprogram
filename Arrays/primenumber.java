package Arrays;

import java.util.Scanner;

public class primenumber {
 public static void main (String args[]){
    Scanner s = new Scanner(System.in);
    primenumber p = new primenumber();
    int i =2;
    while (true){

        if (p.isprime(i)){
            System.out.println(i);
            
        }
            i++;
    }

    
 }   
 Boolean isprime(int var1) {
    for(int var2 = 2; var2 <= var1 / 2; ++var2) {
       if (var1 % var2 == 0) {
          return false;
       }
    }
    return true;
}
}