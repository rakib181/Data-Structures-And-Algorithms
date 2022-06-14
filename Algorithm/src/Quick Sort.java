import java.util.*;

public class QuickSort {
        static int[] arr;
        static void swap(int i,int j){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    static int partition(int l, int h){
        int pivot=arr[l],i=l;
        for (int j=i+1;j<=h;j++){
            if(arr[j]<=pivot){
                i++;
                swap(i,j);
            }
        }
        if(arr[l]>arr[i]){
            swap(i,l);
        }
        return i;
    }
    static void quickSort(int l,int  h){
            if(l<h) {
                int pivIdx = partition(l, h);
                quickSort(l, pivIdx - 1);
                quickSort(pivIdx + 1, h);
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
        System.out.print("Before Sort :");
         for (int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
        quickSort(0,n-1);
        System.out.println();
        System.out.print("After Sort :");
         for (int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}


//Randomized Algorithm
#include<bits/stdc++.h>
using namespace std;

const int N = 105;
int a[N];
int n;

int partition(int l,int h){
  // Randomized Algorithms 
  int piv=a[(rand()) % h + 1],i=l;
  for(int j=i+1;j<=h;j++){
    if(a[j] <= piv){
      i++;
      swap(a[i],a[j]);
    }
  }
  if(a[l] > a[i]) swap(a[i],a[l]);
  return i;
}

void quicksort(int l, int h){
  if(l < h){
  int p=partition(l,h);
  quicksort(l,p-1);
  quicksort(p+1,h);
   }
}

int32_t main(){
   ios_base::sync_with_stdio(0);
    cin.tie(0); 
    cout.tie(0);
    #ifndef ONLINE_JUDGE 
    freopen("input.txt","r",stdin); 
    freopen("output.txt","w",stdout); 
    #endif
    auto start=clock();
    cin >> n;
    for(int i=0;i<n;i++)cin >> a[i];
    quicksort(0,n-1);
  for(int i=0;i<n;i++){
    cout << a[i] << ' ';
  }
    cerr<<1.0 * (clock()-start)/CLOCKS_PER_SEC<<endl;
    return 0;
}

