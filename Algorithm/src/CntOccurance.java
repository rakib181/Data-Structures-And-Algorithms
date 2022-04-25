import java.util.*;

public class CntOccurance {
	public static int binarySearch(int[] arr,int low,int high,int x) {
		int mid=low+(high-low)/2;
		if(low>high) {
			return -1;
		}
		if(arr[mid]==x) {
			return mid;
		}
		if(arr[mid]>x) {
			return binarySearch(arr,x,low,mid-1);
		}
		return binarySearch(arr,x,mid+1,high);
	}
	public static int yo(int[] arr,int low,int high,int x) {
		int idx=binarySearch(arr,low,high,x);
		if(idx==-1) {
			return 0;
		}
		int cnt=1,left=idx-1;
		while(left>=0 && arr[left]==x) {
			cnt++;left--;
		}
		int right=idx+1;
		while(right<high+1 && arr[right]==x) {
			cnt++;
			right++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),low=0,high=n-1;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(yo(arr,low,high,x));
	}
}
