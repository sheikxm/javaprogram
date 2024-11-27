import java.util.Scanner;
public class halfsort {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        halfsort h = new halfsort();
        int n = s.nextInt();
        int i;
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        h.halfsrt(arr,n);
    }
    void halfsrt(int [] arr , int n){
        int m;
        int i;
        int j;
        if(n%2 == 0){
            m = n/2+1;
        }else{
            m= n/2;
        }
        int temp;
        for(i=0;i<m-1;i++){
            for(j=i+1;j<m;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
}
}