import java.util.*;

public class ModifiedBinarySearch {
	public static int yo(int[] arr,int x) {
		int low=0,high=arr.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>arr[low]){
				if(arr[low]<=x && arr[mid]>x) {
					high=mid-1;
				}else {
					low=mid+1;
				}
			}else {
				if(arr[mid]<x && arr[high]>=x) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println(yo(arr,x));
	}
}