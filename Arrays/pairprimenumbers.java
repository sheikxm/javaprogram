import java.util.Scanner;

//input 20 
//input 2,3,5,7,11,13,17,19
//output 2,19,3,17,5,13,7,11
public class pairprimenumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        pairprimenumbers p = new pairprimenumbers();
        int number = s.nextInt();
        
        int arr[] = new int[number];
        int arr2[] = new int[number];
        int i,j;
        int k=0;
        for (i=2;i<number;i++){
            if (p.isprime(i)){
                arr[k++] = i; 
            }
        }
        for (i=0;i<k;i++){
            // System.out.print(arr[i]+ " ");
        }
        int left = 0;
        int right  = k-1;
        
        while(left<right){
            for(i=0;i<k;i++){
                arr2[i++] = arr[left];
                arr2[i] = arr[right];
                left++;
                right--;
            }
        }
        for (i=0;i<k;i++){
            System.out.print(arr2[i]+ " ");
        }

        
    }
  

    Boolean isprime(int n){
        int i;
        for (i=2;i<=n/2;i++){
            if (n%i ==0){
                return false;
            }
        }return true; 
    }
}
