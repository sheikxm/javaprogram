import java.util.Scanner;

public class righttoleftarray {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int i,j;
        for (i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        j = s.nextInt();
        while (j>0){
        
        int temp= arr[n-1];

    for (i=0;i<n-1;i++){
        arr2[++i] = arr[--i];
        arr2[0] = temp; 

    }
        arr2[0] = temp;
        j--;
        for (i=0;i<n;i++){
            arr[i] = arr2[i];
        }
    }
        for(i =0;i<n;i++){
            System.out.println(arr2[i]+ " ");
        }
    

            

        }
        
    }
  
