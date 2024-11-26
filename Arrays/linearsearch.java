import java.util.Scanner;

public class linearsearch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        linearsearch b = new linearsearch();
        int n = s.nextInt();

        int arr[] =  new int[n];

        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();


        }

        int find = s.nextInt();
        int res = b.linearserch(arr,find );
        if (res == -1){
            System.out.print("Not Present");
        }else
        System.out.print(res);
}
int linearserch(int arr[] , int find){ 
   int i;
   for(i=0;i<arr.length;i++){
    if (arr[i] == find){
        return i;
    }
   }return -1;
}
}
