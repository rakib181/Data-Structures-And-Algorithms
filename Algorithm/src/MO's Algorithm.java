import java.util.*;

public class MOsAlgorithm {
    static int MX=105,sum=0;
    static int[] arr=new int[MX];
    static int[] ans=new int[MX];
static class query implements Comparable<query> {
        int l, r, idx;
       public query( int _l, int _r, int _idx){
            this.l = _l;
            this.r = _r;
            this.idx = _idx;
        }
        public int compareTo(query other){
           int block_own=this.l/K;
           int block_other= other.l/K;
          return block_own-block_other!=0?block_own-block_other:r-other.r;
        }
    }
    static int K=0;
    static query[] M;
    static void add(int i){
        sum+=arr[i];
    }
    static void remove(int i){
        sum-=arr[i];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();K=(int)Math.sqrt(n);
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();M=new query[q];
        for (int i=0;i<q;i++){
           int l=sc.nextInt(),r=sc.nextInt();
           M[i]=new query(l,r,i);
        }
       Arrays.sort(M);
        int L=0,R=-1;
        for (int i=0;i<q;i++){
            while (R<M[i].r)add(++R);
            while (R>M[i].r)remove(R--);
            while (L>M[i].l)add(--L);
            while (L<M[i].l)remove(L++);
            ans[M[i].idx]=sum;
        }
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
