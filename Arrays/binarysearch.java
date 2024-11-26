import java.util.Scanner;

public class binarysearch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        binarysearch b = new binarysearch();
        int n = s.nextInt();

        int arr[] =  new int[n];

        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();


        }

        int find = s.nextInt();
        int res = b.binarysearchh(arr,find ,0, arr.length-1  );
        System.out.print(res);
}
int binarysearchh(int arr[] , int find , int low , int high){ 
     binarysearch b =new binarysearch();
    int mid = (low+high)/2;
    while (true){
        if(arr[mid] == find){
            return mid;
        }
        if(arr[mid] < find){
           return b.binarysearchh(arr,find,mid+1,high);
         }

        if(arr[mid] > find){
           return b.binarysearchh(arr,find,low,mid-1);
         }
    }

}
}
