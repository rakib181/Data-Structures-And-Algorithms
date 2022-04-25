import java.util.*;

public class AngryBirds {
	
	public static boolean canPlaceBirds(int B,int n,int[] arr,int mid) {
		int birds=1,locations=arr[0];
		for(int i=1;i<n;i++) {
			int curLocations=arr[i];
			if(curLocations-locations>=mid) {
				birds++;
				locations=curLocations;
				if(birds==B) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),B=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	   }
	  Arrays.sort(arr);
	  int start=0,end=arr[n-1]-arr[0],ans=-1;
	  while(start<=end) {
		  int mid=start+(end-start)/2;
		  boolean canPlace=canPlaceBirds(B,n,arr,mid);
		  if(canPlace) {
			  ans=mid;
			  start=mid+1;
		  }else {
			  end=mid-1;
		  }
	  }
	  System.out.println(ans);
	}
}
