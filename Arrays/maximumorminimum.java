import java.util.Scanner;

//input 5 
//input 3 4 5 6 7 
public class maximumorminimum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        maximumorminimum m = new maximumorminimum();

        int n = s.nextInt();
        int arr[] = new int[n];
        int i;
        for(i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int min=arr[0];
        int max = arr[0];
        for (i=0;i<n;i++){
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i]< min){
                min = arr[i];

            }
        }

        System.out.println("maximum number is "+ " "+max);
        System.out.println("minimum number is "+ " "+min);


    }
}
