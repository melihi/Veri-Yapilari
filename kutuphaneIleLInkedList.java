import java.util.*;

public class kutuphaneIleLInkedList {
     
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(15);
        list.add(23);
        list.add(32);
        list.addLast(10);
        list.addFirst(20);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        Iterator i = list.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(list.remove(4));
        System.out.println(list);
        
    }
}
