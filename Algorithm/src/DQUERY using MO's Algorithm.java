import java.util.*;
 class DQUERY {
    static int MX=1000005,cnt=0,K=0;
    static query[] M;
    static int[] ADQ,ARR,CNT=new int[MX];


    static class query implements Comparable<query>{
        int l,r,idx;
        public query(int _l,int _r,int _idx){
            this.l=_l;
            this.r=_r;
            this.idx=_idx;
        }
        public int compareTo(query other){
            int block_own=l/K,block_other= other.l/K;
            return block_own-block_other!=0?block_own-block_other:r-other.r;
        }
    }
    static void QIncre(int i){
            ++CNT[ARR[i]];
            if (CNT[ARR[i]] == 1) {
                cnt++;
            }
    }
    static void Qdecre(int i){
            --CNT[ARR[i]];
            if (CNT[ARR[i]] == 0) {
                cnt--;
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();K=(int)Math.sqrt(n);
        Arrays.fill(CNT,0);
        ARR=new int[n];
        for (int i=0;i<n;i++){
            ARR[i]=sc.nextInt();
        }
        int q=sc.nextInt();ADQ=new int[q];M=new query[q];
        for (int i=0;i<q;i++){
            int l=sc.nextInt(),r=sc.nextInt();
            M[i]=new query(l-1,r-1,i);
        }
        Arrays.parallelSort(M);
        int L=0,R=-1;
        for(int i=0;i<q;i++){
            while (R<M[i].r)QIncre(++R);
            while (L<M[i].l)Qdecre(L++);
            while (R>M[i].r)Qdecre(R--);
            while (L>M[i].l)QIncre(--L);
            ADQ[M[i].idx]=cnt;
        }
        for (int i=0;i<q;i++){
            System.out.println(ADQ[i]+" ");
        }
        System.out.println();
    }
}
