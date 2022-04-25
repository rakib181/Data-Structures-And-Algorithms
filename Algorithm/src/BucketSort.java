import java.util.*;
public class BucketSort {
	static ArrayList<ArrayList<Integer>>bucket=new ArrayList<ArrayList<Integer>>();
	static void sort(ArrayList<Integer> Sort) {
		for(int i=0;i<Sort.size()-1;i++) {
			int minIdx=i;
			for(int j=i+1;j<Sort.size();j++) {
				if(Sort.get(j)<Sort.get(minIdx)) {
					minIdx=j;
				}
			}
			if(minIdx!=i) {
				Collections.swap(Sort, i, minIdx);
			}
		}
	}
	static void bucket(int MX,int[] arr) {
		int buck=(int)Math.ceil(Math.sqrt(arr.length));
		for(int i=1;i<=buck+1;i++) {
			bucket.add(new ArrayList<Integer>());
		}
		for(int i=0;i<arr.length;i++) {
			int val=(int)Math.ceil((float)(arr[i]*buck)/(float)MX);
			bucket.get(val).add(arr[i]);
		}
		  for(int i=0;i<=buck;i++) { sort(bucket.get(i)); }
			/*
			 * for(int i=1;i<bucket.size();i++) { for(int j=0;j<bucket.get(i).size();j++) {
			 * System.out.print(bucket.get(i).get(j)+" "); } System.out.println(); }
			 */
		for(int i=0;i<bucket.size();i++) {
			for(int j=0;j<bucket.get(i).size();j++) {
				System.out.print(bucket.get(i).get(j)+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),MX=-1000000007;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(MX<arr[i]) {
				MX=arr[i];
			}
		}
		bucket(MX,arr);
	}
}