import java.util.*;
public class MergeSort {
    static void merge(int[] arr,int s,int e){
        int i=s,m=(s+e)/2,j=m+1,k=0,l=0;
        int[] ans=new int[arr.length];
        while (i<=m && j<=e){
            if(arr[i]<arr[j]){
               ans[k++]=arr[i++];
            }else{
                ans[k++]=arr[j++];
            }
        }
        while (i<=m){
            ans[k++]=arr[i++];
        }
        while (j<=e){
            ans[k++]=arr[j++];
        }

        for (int idx=s;idx<=e;idx++){
            arr[idx]=ans[l++];
        }

    }
    static void mergesort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,s,e);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        mergesort(arr,0,n-1);
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
