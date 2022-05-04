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

//Sliding Window Maximum Range Easy
import java.util.*;

public class SlidingWindowMax {
    static void SWM(int[] arr,int n,int k){
        Deque<Integer>Q=new ArrayDeque<>();
        for (int i=0;i<n;i++){
            if(!Q.isEmpty() && Q.peek()==i-k){
                Q.pollFirst();
            }
            while (!Q.isEmpty() && arr[i]>arr[Q.peekLast()]){
                Q.pollLast();
            }
            Q.offerLast(i);
            if(i>=k-1){
                System.out.println(arr[Q.peek()]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SWM(arr,n,k);
    }
}

