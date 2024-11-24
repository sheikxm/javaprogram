import java.util.Scanner;

public class ascending {
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
   ascending as = new ascending();
    int n = s.nextInt();
    int arr[] = new int[n];
    int i;
    for(i = 0;i<n;i++){
        arr[i] = s.nextInt();  
    }
    if (as.isascending(arr)){
        System.out.print("yes");
    }else{
        System.out.print("No");
    }
}
Boolean isascending(int[] arr){
int i;    
for (i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            return false;
            
        }
}return true;

}    
}
