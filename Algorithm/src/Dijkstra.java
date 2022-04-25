import java.util.*;
public class Dijkstra {
	static int MX=105,INF=Integer.MAX_VALUE;
	static ArrayList<ArrayList<Node>>G=new ArrayList<>();
	static int[] dist=new int[MX];
	static boolean[] vis=new boolean[MX];
	static int[] path=new int[MX];
	static class Node{
		int val;
		int cost;
		 Node(int v,int w){
			this.val=v;
			this.cost=w;
		}
	}
	static void dijkstra(int source) {
		PriorityQueue<Node> pq=new PriorityQueue<Node>(new cmp());
		pq.add(new Node(source,0));
		while(!pq.isEmpty()) {
			Node cur=pq.peek();
			pq.poll();
			int val=cur.val,cost=cur.cost;
			if(!vis[val]) {
			dist[val]=cost;	
			vis[val]=true;
			for(int i=0;i<G.get(val).size();i++) {
				int nxt=G.get(val).get(i).val;
				int nxtCost=G.get(val).get(i).cost;
				if(!vis[nxt]) {
					pq.add(new Node(nxt,cost+nxtCost));
				}
			   }
		    }	
		}
	}
	static class cmp implements Comparator<Node>{
		public int compare(Node n1,Node n2) {
			if(n1.cost>n2.cost) {
				return 1;
			}
			return -1;
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int V=sc.nextInt(),Edge=sc.nextInt();
	Arrays.fill(dist, INF);
	Arrays.fill(vis, false);
	for(int i=1;i<=Edge;i++) {
		G.add(new ArrayList<Node>());
	}
	for(int i=1;i<=Edge;i++) {
		int u=sc.nextInt(),v=sc.nextInt(),w=sc.nextInt();
		G.get(u).add(new Node(v,w));
	    }
	int src=sc.nextInt();
	dijkstra(src);
	for(int i=1;i<=V;i++) {
		System.out.print(src+"->"+""+i+" Distance: ");
		if(dist[i]==INF) {
			System.out.println("INF"+" ");
		}else {
			System.out.println(dist[i]+" ");
		}
	  }
	
	}
}