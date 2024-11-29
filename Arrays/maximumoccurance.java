import java.util.Scanner;
public class maximumoccurance {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        maximumoccurance m = new maximumoccurance();

        int n = s.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        m.maxocc(arr,n);
    
    }
  
    
    void maxocc(int arr[], int n){
    int i;
    int max = arr[0];
    for(i=0;i<n;i++){
        if (max<arr[i]){
            max = arr[i];
        } 
    }
    int hash [] = new int[max+1];

    for(i=0;i<n;i++){
        hash[arr[i]]++;
    }
    int cnt =0;
    for(i=0;i<=max;i++){
        if (cnt <hash[i]){
            cnt =hash[i];
        }
    }
    System.out.print(cnt);


        
}
}
