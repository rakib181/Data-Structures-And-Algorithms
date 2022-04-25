import java.util.*;

public class PracBinary {
	public static int firstOcc(int[] arr,int x) {
		int low=0,high=arr.length-1,mid=0,ans=-1;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(arr[mid]==x) {
				ans=mid;
				high=mid-1;
			}else if(arr[mid]>x) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static int lastOcc(int[] arr,int x) {
		int low=0,high=arr.length-1,mid=0,ans=-1;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(arr[mid]==x) {
				ans=mid;
				low=mid+1;
			}else if(arr[mid]<x) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(lastOcc(arr,x)==-1 && firstOcc(arr,x)==-1) {
			System.out.println("-1");
		}else {
		System.out.println(lastOcc(arr,x)-firstOcc(arr,x)+1);
		}
	}
}
