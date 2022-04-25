import java.util.*;
public class FractionKnapsack {
	static void swap(int i,int j,float[] x) {
		float tmp=x[j];
		x[j]=x[i];
		x[i]=tmp;
	}
	static void knapsack(int n,float[] p,float[] w,int c) {
		float maxProfit=0;float u=c;int k=0;
		for(int i=0;i<n;i++) {
			if(w[i]>u) {
				break;
			}else {
				maxProfit+=p[i];
				u-=w[i];
			}
			k=i;
		}
		if(u>0) {
		maxProfit+=p[k+1]*(u/w[k+1]);	
		}
		
		System.out.println(maxProfit);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int obj=sc.nextInt();
	float[] weight=new float[obj];
	float[] profit=new float[obj];
	for(int i=0;i<obj;i++) {
		weight[i]=sc.nextFloat();
		profit[i]=sc.nextFloat();
	}
	int cap=sc.nextInt();
	float[] x=new float[obj];
	for(int i=0;i<obj;i++) {
		x[i]=profit[i]/weight[i];
	}
	/*
	 * for(int i=0;i<obj;i++) { System.out.print(profit[i]+" "); }
	 * System.out.println(); for(int i=0;i<obj;i++) {
	 * System.out.print(weight[i]+" "); } System.out.println(); for(int
	 * i=0;i<obj;i++) { System.out.print(x[i]+" "); }
	 */
	for(int i=0;i<obj;i++) {
		for(int j=i+1;j<obj;j++) {
			if(x[i]<x[j]) {
				swap(i,j,x);
				swap(i,j,profit);
				swap(i,j,weight);
			}
		}
	}
	/*
	 * System.out.println(); for(int i=0;i<obj;i++) {
	 * System.out.print(profit[i]+" "); } System.out.println(); for(int
	 * i=0;i<obj;i++) { System.out.print(weight[i]+" "); } System.out.println();
	 * for(int i=0;i<obj;i++) { System.out.print(x[i]+" "); }
	 */
	knapsack(obj,profit,weight,cap);
	}
}
