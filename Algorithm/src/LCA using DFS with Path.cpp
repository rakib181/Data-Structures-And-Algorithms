#include<bits/stdc++.h>
using namespace std;

const int N=105;
vector<int>G[N];
int Parent[N];

void dfs(int src,int p=-1){
   Parent[src]=p;
   for(auto child:G[src]){
      if(child!=Parent[src])
         dfs(child,src);
   }
}

vector<int> Path(int v){
   vector<int>ans;
   while(v!=-1){
      ans.push_back(v);
      v=Parent[v];
   }
   reverse(ans.begin(),ans.end());
   return ans;
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
    dfs(1);
    int x,y;
    cin>>x>>y;
    vector<int> _x = Path(x);
    vector<int> _y = Path(y);
    int min_len=min(_x.size(),_y.size());
    int lca=-1;
    for(int i=0;i<min_len;i++){
      if(_x[i]==_y[i]){
         lca=_x[i];
      }else{
         break;
      }
    }
    cout<< lca<<endl;
   cerr<< 1.0 * (clock()-st)/CLOCKS_PER_SEC<<'\n';
   return 0;
}
