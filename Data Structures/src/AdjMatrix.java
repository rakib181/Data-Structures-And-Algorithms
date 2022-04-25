import java.util.*;

public class AdjMatrix {
      static ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();
      static void printGraph(ArrayList<ArrayList<Integer>> graph) {
    	  for(int i=0;i<graph.size();i++) {
    		  System.out.print(i+"->");
    		  for(int j=0;j<graph.get(i).size();j++) {
    			  System.out.print(graph.get(i).get(j)+" ");
    		  }
    		  System.out.println();
    	  }
      }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int nodes=sc.nextInt(),edges=sc.nextInt();
	for(int i=0;i<nodes;i++) {
		graph.add(new ArrayList<Integer>());
	}
	for(int i=0;i<edges;i++) {
		int u=sc.nextInt(),v=sc.nextInt();
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	printGraph(graph);
	}
}