import java.util.*;
public class GameOfGreed {
	static boolean divideAmongFrnds(int[] arr,int n,int k,int mid) {
		int partition=0,curSum=0;
		for(int i=0;i<n;i++) {
			if(curSum+arr[i]>=mid) {
				partition++;
				curSum=0;
			}else {
				curSum+=arr[i];
			}
		}
		return partition>=k;
	}
	static int k_partition(int[] arr,int n,int k) {
		int s=0,e=0,ans=-1;
		for(int i=0;i<n;i++) {
			e+=arr[i];
		}
		while(s<=e) {
			int mid=s+(e-s)/2;
			boolean isPossible=divideAmongFrnds(arr,n,k,mid);
			if(isPossible) {
				s=mid+1;
				ans=mid;
			}else {
				e=mid-1;
			}
		}
		return  ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(k_partition(arr,n,k));
	}
}