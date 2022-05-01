import java.util.*;

public class QuickSort {
        static int[] arr;
        static void swap(int i,int j){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    static int partition(int l, int h){
        int pivot=arr[l],i=l;
        for (int j=i+1;j<=h;j++){
            if(arr[j]<=pivot){
                i++;
                swap(i,j);
            }
        }
        if(arr[l]>arr[i]){
            swap(i,l);
        }
        return i;
    }
    static void quickSort(int l,int  h){
            if(l<h) {
                int pivIdx = partition(l, h);
                quickSort(l, pivIdx - 1);
                quickSort(pivIdx + 1, h);
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
        System.out.print("Before Sort :");
         for (int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
        quickSort(0,n-1);
        System.out.println();
        System.out.print("After Sort :");
         for (int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
