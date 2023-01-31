import java.util.*;

public class queueJavaKutuphanesi {
    public static void main(String[] args) {
        Queue<Integer> pQue = new PriorityQueue<>();
        pQue.add(5);
        pQue.add(1);
        pQue.add(2);
        pQue.add(0);
        System.out.println(pQue);
        Queue<Integer> que = new LinkedList<>();
        que.add(100);
        que.add(20);
        que.add(300);
        System.out.println("Peek - > "+que.peek());
        System.out.println("Peek - > "+que.poll());
        System.out.println(que);
    }
}
