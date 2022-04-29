import java.util.*;
public class SqrtDecomposition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),m=(int)Math.sqrt(n)+1;
        int[] arr=new int[n+1];
        int[] b=new int[m+1];
        Arrays.fill(b,0);
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
            b[i/m]+=arr[i];
        }
        int q=sc.nextInt(),ans=0;
        while (q-->0){
            int l=sc.nextInt(),r=sc.nextInt();

            for(int i=l;i<=r;){
                if(i%m==0 && i+m-1<=r){
                   ans+=b[i/m];
                   i+=m;
                }else{
                    ans+=arr[i];
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}


//Sqrt Decomposition with update


import java.util.*;
public class SqrtDecomposition {
    static class Try {
       int n,m;
       int[] arr,b;
       void init(int _n){
           this.n=_n;
           this.m=(int)Math.sqrt(_n)+1;
           this.arr=new int[n+1];
           this.b=new int[m+1];
        Arrays.fill(b,0);
       }
       void update(int idx,int val){
           b[idx/m]=val-arr[idx];
           arr[idx]=val;
       }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
      Try yo=new Try();
      yo.init(n);
      int m=yo.m;
        for(int i=1;i<=n;i++){
            yo.arr[i]=sc.nextInt();
            yo.b[i/m]+=yo.arr[i];
        }
        int q=sc.nextInt(),ans=0;
        while (q-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            yo.update(3,4);
            for(int i=l;i<=r;){
                if(i%m==0 && i+m-1<=r){
                   ans+=yo.b[i/m];
                   i+=m;
                }else{
                    ans+=yo.arr[i];
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}

