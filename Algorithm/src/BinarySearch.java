import java.util.*;

public class BinarySearch {
	public static int letsGo(int[] arr,int x) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				low=mid+1;
			}
			if(arr[mid]>x) {
				high=mid-1;
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
		System.out.println(letsGo(arr,x));
	}
}
