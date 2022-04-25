import java.util.*;
public class AdjList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int node=sc.nextInt(),edge=sc.nextInt();
		ArrayList<LinkedList<Integer>>G=new ArrayList<>();
		for(int i=1;i<=edge+1;i++) {
			G.add(new LinkedList<Integer>());
		}
		for(int i=1;i<=edge;i++) {
			int u=sc.nextInt(),v=sc.nextInt();
			G.get(u).add(v);
			G.get(v).add(u);
		}
		for(int i=1;i<edge;i++) {
			System.out.print(i+"->");
			for(int j=0;j<G.get(i).size();j++) {
				System.out.print(G.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
