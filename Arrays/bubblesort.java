import java.util.Scanner;
public class bubblesort {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] =  new int[n];

        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();

        }
        int i;
        int j;
        int temp;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
