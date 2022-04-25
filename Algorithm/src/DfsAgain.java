import java.util.*;
public class DfsAgain {
    static int MX=1000;
    static ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
    static boolean[] vis=new boolean[MX]; 
    static void dfs(int node) {
    	vis[node]=true;
    	System.out.print(node+" ");
    	for(int i=0;i<graph.get(node).size();i++) {
    		int nxt=graph.get(node).get(i);
    		if(vis[nxt]==false) {
    			dfs(nxt);
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),e=sc.nextInt();
		Arrays.fill(vis, false);
      for(int i=0;i<n;i++) {
    	  graph.add(new ArrayList<Integer>());
      }
      for(int i=0;i<e;i++) {
    	  int u=sc.nextInt(),v=sc.nextInt();
    	  graph.get(u).add(v);
    	  //graph.get(v).add(u);
      }
      dfs(0);
	}
}