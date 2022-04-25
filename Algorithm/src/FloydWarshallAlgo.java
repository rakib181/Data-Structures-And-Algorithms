import java.util.*;
public class FloydWarshallAlgo {
	static int INF=Integer.MAX_VALUE;
	static long[][] floydWarshall(long[][] path,int n){
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(path[i][k]+path[k][j]<path[i][j]) {
					path[i][j]=Math.min(path[i][j], path[i][k]+path[k][j]);
					}
				}
			}
		}
		return path;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[][] path=new long[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					path[i][j]=0;
				}else {
				path[i][j]=INF;
				}
			}
		}
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			int x=sc.nextInt(),y=sc.nextInt(),wt=sc.nextInt();
			path[x][y]=wt;
		}
	
		long[][] shortest=floydWarshall(path,n);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(path[i][j]==INF) {
					System.out.print("INF"+" ");
				}else {
				System.out.print(shortest[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
