import java.util.Scanner;

public class greaterthanprevious {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        greaterthanprevious g = new greaterthanprevious();
        int n = s.nextInt();
        int arr [] = new int[n];
        int i;
        for (i=0;i<n;i++){
            arr[i] =s.nextInt();
        }
        g.isgreater(arr);


    }
    void isgreater(int [] arr){
        int i;
        int max = arr[0];
        for(i=0;i<arr.length;i++){
            if (arr[i] >=max){
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
