import java.util.Scanner;

public class InfiniteBinarySearch {
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
	public static int infiniteBinSearch(int[] arr,int x,int low,int high) {
		while(arr[high]<x) {
			low=high;
			high*=2;
		}
		return yo(arr,x,low,high);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),low=0,high=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println(infiniteBinSearch(arr,x,low,high));
	}

}
