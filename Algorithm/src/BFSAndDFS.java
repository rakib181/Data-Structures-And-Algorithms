import java.util.*;

public class BFSAndDFS {
	static int MX=105,INF=Integer.MAX_VALUE;
	static ArrayList<ArrayList<Integer>>G=new ArrayList<>();
	static boolean[] visited=new boolean[MX];
	static int[] dist=new int[MX];
	static void init(int n) {
		for(int i=0;i<=n;i++) {
			G.add(new ArrayList<>());
		}
		Arrays.fill(visited, false);
		Arrays.fill(dist, INF);
	}
	static void addEdge(int u,int v) {
		G.get(u).add(v);
		//G.get(v).add(u);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),e=sc.nextInt();
		init(n);
        for(int i=0;i<e;i++) {
        	int u=sc.nextInt(),v=sc.nextInt();
        	addEdge(u,v);
        }
        int source=sc.nextInt();
        //bfs(source);
        dfs(source);
        System.out.println();
		/*
		 * for(int i=0;i<n;i++) { System.out.print(dist[i]+" "); }
		 */
	}
	static void bfs(int source) {
		Queue<Integer>q=new LinkedList<>();
		visited[source]=true;
		dist[source]=0;
		q.offer(source);
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			for(int i=0;i<G.get(node).size();i++) {
				int nxt=G.get(node).get(i);
				if(!visited[nxt]) {
					visited[nxt]=true;
					dist[nxt]=dist[node]+1;
					q.offer(nxt);
				}
			}
		}
	}
	static void dfs(int src) {
		Stack<Integer> st=new Stack<>();
		st.push(src);
		while(!st.isEmpty()) {
			int node=st.pop();
			if(!visited[node]) {
				visited[node]=true;
				System.out.print(node+" ");
			}
			for(int it:G.get(node)) {
				if(!visited[it]) {
					st.push(it);
				}
			}
		}
	}
}
