import java.util.*;

public class ModifiedBs {
	public static int letsGo(int[] arr,int x,int low,int high) {
	     if(low>high) {
	    	 return -1;
	     }
		int mid=(low+high)/2;
		if(arr[mid]==x) {
			return mid;
		}
		if(arr[mid]>arr[low]) {
			if(arr[low]<=x && arr[mid]>x) {
				return letsGo(arr,x,low,mid-1);
			}else {
				return letsGo(arr,x,mid+1,high);
			}
		}else {
			if(arr[mid]<=x && arr[high]>x) {
				return letsGo(arr,x,mid+1,high);
			}else {
				return letsGo(arr,x,low,mid-1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),low=0,high=n-1;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
      System.out.println(letsGo(arr,x,low,high));
	}
}
