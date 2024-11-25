import java.util.Scanner;
public class kthlargest {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] =  new int[n];

        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();

        }
        int k = s.nextInt();
        int i;
        int j;
        int temp;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }   
            }
        }
        int cnt =1;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                if(cnt==k){
                    System.out.print(arr[i]);
                    break;
                }
                cnt++;
            }
            
        }


    }
}
