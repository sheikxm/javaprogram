import java.util.Scanner;

public class lefttoright {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i;

        for (i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int j = s.nextInt();
        while(j>0){
        int temp = arr[0];
        for (i=1;i<n;i++){
            arr[i-1] =arr[i];
        }
        arr[n-1] = temp;
        j--;

    }

        for (i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
