import java.util.*;

public class SlidingRMQ {
    static void letsTry(int n,int k,int[] arr){
        Deque<Integer>Qi=new ArrayDeque<>();
        Collections.reverseOrder();
        int i;
        for(i=0;i<k;i++){
            while (!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]){
                Qi.pollLast();
            }

            Qi.offerLast(i);
        }
        for (;i<n;i++){
            System.out.print(arr[Qi.peek()]+" ");
            while (!Qi.isEmpty() && Qi.peek()<=i-k){
                Qi.pollFirst();
            }
            while (!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]){
                Qi.pollLast();
            }
            Qi.offerLast(i);
        }
        System.out.println(arr[Qi.peek()]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        letsTry(n,k,arr);
    }
}
