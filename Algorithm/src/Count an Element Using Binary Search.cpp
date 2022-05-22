#include<bits/stdc++.h>
using namespace std;

int FbinarySearch(int ar[],int s,int e,int x){
   int mid=(s+e)>>1,ans;
   if(s>e){
      return ans;
   }
   if(s==e && ar[s]==x){
      ans=s;
      e=mid-1;
   }
   if(ar[mid]==x){
      ans=mid;
      e=mid-1;
   }else if(ar[mid]<x){
      FbinarySearch(ar,s,mid-1,x);
   }else{
      FbinarySearch(ar,mid+1,e,x);
   }
}
int LbinarySearch(int ar[],int s,int e,int x){
   int mid=(s+e)>>1,ans;
   if(s>e){
      return ans;
   }
   if(s==e && ar[s]==x){
      ans=s;
      e=mid+1;
   }
   if(ar[mid]==x){
      ans=mid;
      e=mid+1;
   }else if(ar[mid]<x){
      LbinarySearch(ar,s,mid-1,x);
   }else{
      LbinarySearch(ar,mid+1,e,x);
   }
}

int32_t main(){
   ios_base::sync_with_stdio(0);
    cin.tie(0);
    #ifndef ONLINE_JUDGE
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    #endif
    auto st=clock();
    int n,x;
    cin>>n>>x;
    int ar[n+2];
    for(int i=0;i<n;i++){
      cin>>ar[i];
    }
    sort(ar,ar+n);
    cout<<LbinarySearch(ar,0,n-1,x)-FbinarySearch(ar,0,n-1,x)+1;
    
   cerr<< 1.0 * (clock()-st)/CLOCKS_PER_SEC<<'\n';
   return 0;
}
