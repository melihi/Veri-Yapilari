import java.util.Stack;
public class stackJavaKutuphanesi {
    public static void main(String[] args) {
        Stack<Integer> yigit = new Stack<>();
        yigit.push(1);
        yigit.push(2);
        yigit.push(3);
        yigit.push(4);
        System.out.println(yigit.peek());
        System.out.println(yigit.pop());

    }
    
}
