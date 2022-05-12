import java.io.*;
import java.util.StringTokenizer;

public class SparseTable {
    static int MX=105;
    static int[][] sparse;
    static int LOG(int n){
        return 31-Integer.numberOfLeadingZeros(n);
    }
    static void preProgress(int[] arr,int n){
        for(int i=0;i<n;i++){
            sparse[i][0]=i;
        }
        for(int i=1;(1<<i)<=n;i++){
            for(int j=0;(j+(1<<i)-1)<n;j++){
                if(arr[sparse[j][i-1]]<arr[sparse[j+(1<<(i-1))][i-1]]){
                    sparse[j][i]=sparse[j][i-1];
                }else{
                    sparse[j][i]=sparse[j+(1<<(i-1))][i-1];
                }
            }
        }
    }
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int[] arr=new int[n];
        sparse=new int[n][LOG(n)+1];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=sc.nextInt(),high=sc.nextInt(),l,k;
        preProgress(arr,n);
            l=(high-low)+1;
            k=LOG(l);
            if(arr[sparse[low][k]]<=arr[sparse[low+l-(1<<k)][k]]){
                out.println(arr[sparse[low][k]]);
            }else{
                out.println(arr[sparse[high-(1<<k)+1][k]]);
            }
        out.flush();
        out.close();
    }
    public static PrintWriter out;
    public static class MyScanner{
        BufferedReader br;
        StringTokenizer st;
        MyScanner(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st==null || ! st.hasMoreElements()){
                try {
                    st=new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return  Integer.parseInt(next());
        }
    }
}
