import java.util.*;

public class BinarySearchRecur {
	public static int yo(int[] arr,int x,int low,int high) {
		if(low>high) {
			return -1;
		}
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				return yo(arr,x,mid+1,high);
			}
			return yo(arr,x,low,mid-1);	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),low=0,high=n;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
       System.out.println(yo(arr,x,low,high));
	}

}
