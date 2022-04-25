import java.util.*;

public class AdjMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int node=sc.nextInt(),edge=sc.nextInt();
		int[][] G=new int[edge+1][edge+1];
         for(int i=1;i<=edge;i++) {
        	 int u=sc.nextInt(),v=sc.nextInt();
        	 G[u][v]=v;
        	 G[v][u]=u; 
         }
         for(int i=1;i<=edge;i++) {
        	 System.out.print(i+"->");
        	 for(int j=1;j<=edge;j++) {
        		 System.out.print(G[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}
}
