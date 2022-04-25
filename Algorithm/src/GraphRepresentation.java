import java.util.*;
public class GraphRepresentation {
	static boolean[] visited=new boolean[100];
	static ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer>res=new ArrayList<>();
	static void dfs(int node) {
		visited[node]=true;
		for(int i=0;i<graph.get(node).size();i++) {
			int nxt=graph.get(node).get(i);
			if(!visited[nxt]) {
				dfs(nxt);
			}
		}
		res.add(node);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int node=sc.nextInt(),edges=sc.nextInt();
		Arrays.fill(visited, false);
		for(int i=0;i<node+1;i++) {
			graph.add(new ArrayList<Integer>());
		}
        for(int i=0;i<edges;i++) {
        	int u=sc.nextInt(),v=sc.nextInt();
        	graph.get(u).add(v);
        }
        for(int i=1;i<=node;i++) {
        	if(!visited[i])
        	dfs(i);
        }
       Collections.reverse(res);
       for(int i=0;i<res.size();i++) {
    	   System.out.print(res.get(i)+" ");
       }
		/*
		 * for(int i=0;i<graph.size();i++) { System.out.print(i+"->"); for(int
		 * j=0;j<graph.get(i).size();j++) { System.out.print(graph.get(i).get(j)+" "); }
		 * System.out.println(); }
		 */
	}
}