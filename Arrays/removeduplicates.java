    import java.util.Scanner;
    public class removeduplicates {
        public static void main(String ar[]){
        Scanner s = new Scanner(System.in);
        removeduplicates r = new removeduplicates();
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();  
        }
        r.remove(arr);

    }
    void remove(int [] arr){
        int i,j;
        int f =4;
        for(i=0;i<arr.length;i++){
            for(j=0;j<i;j++){
            if (arr[i]==arr[j]){
                
                f--;
                break;
            }}

            if(f==4){
                System.out.print(arr[i]+ " ");        
        }
        f=4;

    }
    }
    }
