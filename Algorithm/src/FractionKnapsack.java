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


//Fraction Knapshack Using Node

import java.util.*;

public class FractionKnapshack {
    static void merge(node[] pAw,int s,int  e){
        int i=s,m=(s+e)/2,j=m+1,k=0,l=0;
        node[] ans=new node[pAw.length];
        while (i<=m && j<=e){
            if(pAw[i].profit>pAw[j].profit){
                ans[k++]=pAw[i++];
            }else {
                ans[k++]=pAw[j++];
            }
        }
        while (i<=m){
            ans[k++]=pAw[i++];
        }
        while (j<=e){
            ans[k++]=pAw[j++];
        }

        for (int idx=s;idx<=e;idx++){
            pAw[idx]=ans[l++];
        }
    }
    static void mergesort(node[] pAw,int s,int e){
        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        mergesort(pAw,s,mid);
        mergesort(pAw,mid+1,e);
        merge(pAw,s,e);
    }
    static class node{
        float p,w,profit;
        node(float _p,float _w,float pro){
            this.p=_p;
            this.w=_w;
            this.profit=pro;
        }
    }
    static float Knapshack(node[] pAw,int c){
        float maxProfit=0,use=c;int k=0;
        for (int i=0;i<pAw.length;i++){
            if (pAw[i].w>use){
                break;
            }else{
                maxProfit+=pAw[i].p;
                use-=pAw[i].w;
            }
            k=i;
        }
        if(use>0){
            maxProfit+=pAw[k+1].p*(use/pAw[k+1].w);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int obj=sc.nextInt();
        node[] pAw=new node[obj];
        for(int i=0;i<obj;i++){
            float a=sc.nextFloat(),b=sc.nextFloat();
            pAw[i]=new node(a,b,a/b);
        }
        int capacity=sc.nextInt();
         mergesort(pAw,0,obj-1);
        float x=Knapshack(pAw,capacity);
        System.out.println(x);
    }
}

