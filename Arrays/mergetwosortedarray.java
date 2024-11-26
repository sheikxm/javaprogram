import java.util.Scanner;
public class mergetwosortedarray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        mergetwosortedarray m = new mergetwosortedarray();
        System.out.println("please enter 1st Array size");
        int n1 = s.nextInt();
        int i;
        int arr1[] = new int[n1];
        for(i=0;i<n1;i++){
            System.out.println("please enter Array value");
            arr1[i] = s.nextInt();
        }
        System.out.println("please enter 2ndArray size");
        int n2 = s.nextInt();
        int arr2 [] = new int[n2];
        for(i=0;i<n2;i++){
            System.out.println("please enter Array value");
            arr2[i] = s.nextInt();
        }

        if(m.issorted(arr1) && m.issorted(arr2)){
            m.mergesort(arr1,arr2);
        }else{
            System.out.print("Not possible");
        }

      }
    boolean issorted(int [] arr){
        int i;
        int n = arr.length;
        for(i=0;i<n-1;i++){

                if (arr[i]>arr[i+1]){
                    return false;
                }
            }return true;
        }
    void mergesort(int arr1[], int arr2[]){
       int n1 = arr1.length;
       int  n2 = arr2.length;
       int arr3 [] = new int[n1+n2];

       int i =0;int j=0;int k =0;
       while (i<n1 && j<n2){
        if (arr1[i] < arr2[j]){
            arr3[k++] = arr1[i++];
        }
        else{
            arr3[k++] = arr2[j++];
        }
       }
       while(i<n1){
        arr3[k++] = arr1[i++];
    }
    while(j<n2){
        arr3[k++] = arr2[j++];
    }

       for(i=0;i<arr3.length;i++){
        System.out.print(arr3[i]+ " ");

       }
    }
    

    }

