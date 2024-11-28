import java.util.Scanner;
public class hashing {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        hashing h = new hashing();

        int n = s.nextInt();
        int arr[] = new int[n];

        int i;
        for(i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        h.hashmap(arr);
        }
    void hashmap(int arr[]){
        int i;
        int n =arr.length;
        int max = arr[0];
        for(i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int hash[] = new int[max+1];

        for(i=0;i<n;i++){
            hash[arr[i]]++;

            }

    
        for(i=0;i<=max;i++){
            if(hash[i]>0){
            System.out.print( i+ ":"+ hash[i] + " " + "Times"+ " " );
            }
        }
        
    }

}
