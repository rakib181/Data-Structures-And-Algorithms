import java.util.*;
public class Sorting {
	static void swap(int x, int y, int[] arr) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	static int partition(int l, int h, int[] arr) {
		int pivot = arr[l], i = l, j = h;
		while (i < j) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(i, j, arr);
			}
		}
		swap(j, l, arr);
		return j;
	}
	static int[] quickSort(int l, int h, int[] arr) {
		if (l < h) {
			int pivotIdx = partition(l, h, arr);
			quickSort(l, pivotIdx - 1, arr);
			quickSort(pivotIdx + 1, h, arr);
		}
		return arr;
	}
	static int[] insertionSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int k = i - 1, key = arr[i];
			while (k >= 0 && key < arr[k]) {
				arr[k + 1] = arr[k];
				k--;
			}
			arr[k + 1] = key;
		}
		return arr;
	}
	static int[] selectionSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			if (minIdx != i) {
				swap(i, minIdx, arr);
			}
		}
		return arr;
	}
	static int[] bubble(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1, arr);
				}
			}
		}
		return arr;
	}
	static int[] bruteForce(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					swap(i, j, arr);
				}
			}
		}
		return arr;
	}
	static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = l + (r - l) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, r);
		}
	}
	static void merge(int[] arr, int l, int r) {
		int i = l, m = (l + r) / 2, j = m + 1, k = 0, t = 0;
		int[] ans = new int[arr.length];
		while (i <= m && j <= r) {
			if (arr[i] < arr[j]) {
				ans[k++] = arr[i++];
			} else {
				ans[k++] = arr[j++];
			}
		}
		while (i <= m) {
			ans[k++] = arr[i++];
		}
		while (j <= r) {
			ans[k++] = arr[j++];
		}

		for (int idx = l; idx <= r; idx++) {
			arr[idx] = ans[t++];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		  int[] sorted= bubble(arr,n);
		  
		  for(int i=0;i<n;i++) { System.out.print(sorted[i]+" "); }
		  
		  System.out.println();  int[] sort=bruteForce(arr,n);
		  
		  for(int i=0;i<n;i++) { System.out.print(sort[i]+" "); }
		  
		  System.out.println();  int[] sort1=insertionSort(arr,n);
		  
		  for(int i=0;i<n;i++) { System.out.print(sort1[i]+" "); }
		  
		  System.out.println();  int[] sort2=selectionSort(arr,n);
		  
		  for(int i=0;i<n;i++) { System.out.print(sort2[i]+" "); }
		  
		  System.out.println();  int[] sort3=quickSort(0,n-1,arr);
		 
		  for(int i=0;i<n;i++) { System.out.print(sort3[i]+" "); }
		 
		  System.out.println();
		   mergeSort(arr, 0, arr.length - 1);
	     	for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
