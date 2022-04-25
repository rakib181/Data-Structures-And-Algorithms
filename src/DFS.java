import java.util.*;

public class DFS {
	static ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
	static boolean []visited=new boolean[20];
	
	public static void dfs(int source) {
		visited[source]=true;
		for(int i=0;i<graph.get(source).size();i++) {
			int next=graph.get(source).get(i);
			if(visited[next]==false) {
				dfs(next);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nodes=sc.nextInt(),edges=sc.nextInt();
		Arrays.fill(visited,false);
		for(int i=0;i<nodes;i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<edges;i++) {
			int u=sc.nextInt(),v=sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}	
		dfs(0);
		for(int i=0;i<visited.length;i++) {
				System.out.print(visited[i]+" ");
		}
	}
}
