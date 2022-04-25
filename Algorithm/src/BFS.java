import java.util.*;
public class BFS {
	static int MX=105,INF=100000007;
   static ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
    static boolean[] vis=new boolean[MX];
    static int[] dist=new int[MX]; 
    static void bfs(int node) {
    	Queue<Integer>Q=new LinkedList<>();
    	vis[node]=true;
    	dist[node]=0;
    	Q.add(node);
    	while(!Q.isEmpty()) {
    		int src=Q.peek();
    		Q.poll();
    		for(int i=0;i<graph.get(src).size();i++) {
    			int nxt=graph.get(src).get(i);
    			if(!vis[nxt]) {
    				vis[nxt]=true;
    				dist[nxt]=dist[src]+1;
    				Q.add(nxt);
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int node=sc.nextInt(),edges=sc.nextInt();
		Arrays.fill(vis, false);
		Arrays.fill(dist, INF);
		for(int i=0;i<=node;i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<edges;i++) {
			int u=sc.nextInt(),v=sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		int source=sc.nextInt();
		bfs(source);
        for(int i=1;i<=node;i++) {
        	System.out.print(dist[i]+" ");
        }
	}
}