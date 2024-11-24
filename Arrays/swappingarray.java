import java.util.Scanner;

public class swappingarray {
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    int i;
    for(i = 0;i<n;i++){
        arr[i] = s.nextInt();  
    }

    int temp;
    for(i=0;i<n/2;i++){
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] =temp; 
    }

    for (i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }

}    
}
