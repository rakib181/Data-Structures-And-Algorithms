import java.util.*;
public class Question1 {
   void delDupli(LinkedList yo) {
	   Set<Integer>set=new HashSet<>();
	   NodeCls cur=yo.head;
	   NodeCls prev=null;
	   while(cur!=null) {
		   int curVal=cur.data;
		   if(set.contains(curVal)) {
			   prev.next=cur.next;
			   yo.size--;
		   }else {
			   set.add(curVal);
			   prev=cur;
		   }
		   cur=cur.next;
	   }
   }
   NodeCls NthLast(LinkedList yo,int n) {
	   NodeCls p1=yo.head;
	   NodeCls p2=yo.head;
	   for(int i=0;i<n;i++) {
		   if(p1==null) 
			   return null; 
		   p2=p2.next;
		   
	   }
	   while(p2!=null) {
		   p1=p1.next;
		   p2=p2.next;
	   }
	   return p1;
   }
   LinkedList partition(LinkedList yo,int x) {
	   NodeCls curNode=yo.head;
	   yo.tail=yo.head;
	   while(curNode!=null) {
		   NodeCls next=curNode.next;
		   if(curNode.data<x) {
			   curNode.next=yo.head;
			   yo.head=curNode;
		   }else {
			   yo.tail.next=curNode;
			   yo.tail=curNode;
		   }
		   curNode=next;
	   }
	   yo.tail.next=null;
	   return yo;
   }
   LinkedList sumOfDigits(LinkedList yo,LinkedList ty) {
	   NodeCls n1=yo.head;
	   NodeCls n2=ty.head;
	   int carry=0;
	   LinkedList trying=new LinkedList();
	   while(n1!=null || n2!=null) {
		   int res=carry;
		   if(n1!=null) {
			   res+=n1.data;
			   n1=n1.next;
		   }
		   if(n2!=null) {
			   res+=n2.data;
			   n2=n2.next;
		   }
		   trying.Insert(res%10);
		   carry=res/10;
	   }
	   return trying;
   }
   NodeCls kthNode(NodeCls head,int k) {
	   NodeCls cur=head;
	   while(k>0 && cur!=null) {
		   cur=cur.next;k--;
	   }
	   return cur;
   }
   NodeCls findNode(LinkedList yo,LinkedList ty) {
	   if(yo.head==null || ty.head==null) {
		   return null;
	   }
	   if(yo.tail !=ty.tail) {
		   return null;
	   }
	   NodeCls longer=new NodeCls();
	   NodeCls shorter =new NodeCls();
	   if(yo.size>ty.size) {
		   longer=yo.head;
		   shorter =ty.head;
	   }else {
		   longer=ty.head;
		   shorter=yo.head;
	   }
	   longer=kthNode(longer,Math.abs(yo.size-ty.size));
	   while(longer!=shorter) {
		   longer=longer.next;
		   shorter=shorter.next;
	   }
	   return longer;
   }
   void InsSameNode(LinkedList llA,LinkedList llB,int x) {
	   NodeCls new_node=new NodeCls();
	   new_node.data=x;
	   llA.tail.next=new_node;
	   llA.tail=new_node;
	   llB.tail.next=new_node;
	   llB.tail=new_node;
   }
}