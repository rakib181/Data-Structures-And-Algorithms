import java.util.*;
class SegmentDQUERY {
    static HashSet[] set;
    static class seg{
        int n;
        void init(int _n){
          int h=4*_n;
          set=new HashSet[h];
          for (int i=0;i<h;i++){
              set[i]=new HashSet<>();
          }
        }
        void build(int start,int end,int node,int[] v){
            if(start==end){
                set[node].add(v[start]);
                return;
            }
            int mid=(start+end)/2;
            build(start,mid,2*node+1,v);
            build(mid+1,end,2*node+2,v);
           set[node].addAll(set[2*node+1]);
           set[node].addAll(set[2*node+2]);
        }
        HashSet<Integer> query(int start,int ending,int l,int r,int node){
            HashSet<Integer>set1=new HashSet<>();
            HashSet<Integer>left;
            HashSet<Integer>right;
            if(start>r || ending<l){
                return set1;
            }
            if(start>=l && ending<=r){
                return set[node];
            }
            int mid=(start+ending)/2;
            left=query(start,mid,l,r,2*node+1);set1.addAll(left);
            right=query(mid+1,ending,l,r,2*node+2);set1.addAll(right);
            return set1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        seg sg=new seg();
        sg.init(n);
        int[] v=new int[n];
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        sg.build(0,n-1,0,v);
        int q=sc.nextInt();
        while (q-->0){
            int l=sc.nextInt(),r=sc.nextInt();
           HashSet<Integer> yo= sg.query(0,n-1,l-1,r-1,0);
            System.out.println(yo.size());
        }
    }
}
