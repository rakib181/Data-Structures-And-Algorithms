#include<bits/stdc++.h>
using namespace std;
const int MX=105;
vector<int>G[MX+1];
int depth[MX+1];
int Par[MX+1];

void dfs(int src,int par){
   Par[src]=par;
   depth[src]=depth[par]+1;
   for(auto it:G[src]){
      if(it!=par){
         dfs(it,src);
      }
   }
}

int LCA(int i,int j){
   if(i==j)return j;

   if(depth[i]<depth[j])swap(i,j);
   int diff=depth[i]-depth[j];

   while(diff--){
      i=Par[i];
   }
   while(i!=j){
      i=Par[i];
      j=Par[j];
   }
   return i;
}

int32_t main(){
   ios_base::sync_with_stdio(0);
    cin.tie(0);
    #ifndef ONLINE_JUDGE
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    #endif
    auto st=clock();
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
      int x,y;
      cin>>x>>y;
      G[x].push_back(y);
      G[y].push_back(x);
    }
    dfs(1,0);
    cout<<LCA(9,12)<<" "<<LCA(10,8);
    
   cerr<< 1.0 * (clock()-st)/CLOCKS_PER_SEC<<'\n';
   return 0;
}
